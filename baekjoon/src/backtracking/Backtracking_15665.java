package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Backtracking_15665 {
	
	static int N,M;
	static ArrayList<Integer> list=new ArrayList<>();
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int element=Integer.parseInt(st.nextToken());
			if(!list.contains(element)) list.add(element);
		}
		br.close();
		
		Collections.sort(list);
		
		dp(0,"");
		
		System.out.println(sb);

	}
	
	static void dp(int depth, String str) {
		
		if(depth==M) {
			sb.append(str).append('\n');
			return;
		}
		
		for(int i=0;i<list.size();i++) {
			dp(depth+1,str+list.get(i)+" ");
		}
		
	}

}
