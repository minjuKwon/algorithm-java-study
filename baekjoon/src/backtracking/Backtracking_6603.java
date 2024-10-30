package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backtracking_6603 {

	static int k;
	static int [] num;
	static boolean [] visited;
	static StringBuilder sb=new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			k=Integer.parseInt(st.nextToken());
			if(k==0) break;
			
			num=new int[k];
			visited=new boolean[k];
			
			for(int i=0;i<k;i++) num[i]=Integer.parseInt(st.nextToken());
			dp(0,0);
			sb.append('\n');
		}
		
		br.close();
		
		System.out.println(sb);
		
	}
	
	static void dp(int depth, int start) {
		if(depth==6) {
			for(int i=0;i<k;i++) {
				if(visited[i]) sb.append(num[i]).append(' ');
			}
			sb.append('\n');
		}
		
		for(int i=start;i<k;i++) {
			visited[i]=true;
			dp(depth+1,i+1);
			visited[i]=false;
		}
	}

}
