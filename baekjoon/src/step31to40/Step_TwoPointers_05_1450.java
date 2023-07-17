package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Step_TwoPointers_05_1450 {
	
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
		
		ArrayList<Integer> listLeft=new ArrayList<>();
		ArrayList<Integer>listRight=new ArrayList<>();
		
		dfs(0, N/2, 0, listLeft);
		dfs(N/2+1, N-1, 0, listRight);
		
		Collections.sort(listRight);
		
		int answer=0;
		
		for(int i=0;i<listLeft.size();i++) {
			int value=C-listLeft.get(i);
			answer+=binarySearch(listRight,value)+1;
		}
		
		System.out.println(answer);

	}
	
	static void dfs(int start, int end, int sum, ArrayList<Integer>list) {
		
		if(sum>C) {
			return;
		}
		
		if(start>end) {
			list.add(sum);
			return;
		}
		
		dfs(start+1, end, sum+arr[start], list);
		dfs(start+1, end, sum, list);
		
	}
	
	static int binarySearch(ArrayList<Integer>sum, int target) {
		
		int left=0; 
		int right=sum.size()-1;
		int answer=-1;
		
		while(left<=right) {
			int mid=(left+right)/2; 
			if(sum.get(mid)<=target) {
				answer=mid;
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		
		return answer;
		
	}

}
