package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Backtracking_15666 {
	
	static int len,M;
	static ArrayList<Integer> arr;
	static StringBuilder sb=new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		arr=new ArrayList<>();
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int element=Integer.parseInt(st.nextToken());
			if(!arr.contains(element)) arr.add(element);
		}
		br.close();
		
		len=arr.size();
		Collections.sort(arr);
		
		dp(0,0,"");
		
		System.out.println(sb);
		
	}
	
	static void dp(int depth, int idx, String str) {
		if(depth==M) {
			sb.append(str).append('\n');
			return;
		}
		for(int i=idx;i<len;i++) {
			dp(depth+1,i,str+arr.get(i)+" ");
		}
	}

}
