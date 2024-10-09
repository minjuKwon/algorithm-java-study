package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backtracking_2618 {
	
	static int N,W;
	static int [][] event, dp;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		W=Integer.parseInt(br.readLine());
		
		event=new int[W+1][2];
		dp=new int[W+1][W+1];
		
		for(int i=1;i<=W;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			event[i][0]=Integer.parseInt(st.nextToken());
			event[i][1]=Integer.parseInt(st.nextToken());
		}
		br.close();
		
		StringBuilder sb=new StringBuilder();
		
		sb.append(dfs(1,0,0)).append('\n');
		
		int one=0; int two=0;
		for(int i=1;i<=W;i++) {
			int dist=getDistance(1,one,i);
			if(dp[one][two]-dist==dp[i][two]) {
				one=i;
				sb.append(1).append('\n');
			}else {
				two=i;
				sb.append(2).append('\n');
			}
		}
		
		System.out.println(sb);

	}
	
	static int dfs(int e, int one, int two) {
		if(e>W) return 0;
		if(dp[one][two]!=0) return dp[one][two];
		int car1=dfs(e+1,e,two)+getDistance(1,one, e);
		int car2=dfs(e+1,one,e)+getDistance(2,two,e);
		return dp[one][two]=Math.min(car1, car2);
	}
	
	static int getDistance(int type, int start, int end) {
		int [] st=event[start];
		int [] ed=event[end];
		if(start==0) {
			if(type==1) st=new int[] {1,1};
			else st=new int[] {N,N};
		}
		return Math.abs(st[0]-ed[0])+Math.abs(st[1]-ed[1]);
	}

}
