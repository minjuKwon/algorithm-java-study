package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class TwoPointers_1450 {
	
	static int [] arr;
	static int N,C;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		C=Integer.parseInt(st.nextToken());
		
		arr=new int[N];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		br.close();
		
		ArrayList<Integer> left=new ArrayList<>();
		ArrayList<Integer> right=new ArrayList<>();
		
		dfs(0, N/2, 0, left);
		dfs((N/2)+1, N-1, 0, right);
		
		Collections.sort(right);
		
		int answer=0;
		for(int i=0;i<left.size();i++) {
			int temp=C-left.get(i);
			answer+=binary(temp,right)+1;
		}
		
		System.out.println(answer);

	}
	
	static void dfs(int start, int end, int sum, ArrayList<Integer> list) {
		if(sum>C) return;
		if(start>end) {
			list.add(sum);
			return;
		}
		
		dfs(start+1, end, sum+arr[start],list);
		dfs(start+1, end, sum,list);		
	}
	
	static int binary(int target, ArrayList<Integer> list) {
		int left=0;
		int right=list.size()-1;
		while(left<=right) {
			int mid=left+((right-left)/2);
			if(list.get(mid)<=target) {
				 left=mid+1;
			}
			else right=mid-1;
		}
		return left-1;
	}

}
