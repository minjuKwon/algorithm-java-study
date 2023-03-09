package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/122
public class Step_17_08_14889 {
	
	static int[][] arr;
	static boolean[] visit;
	static int N;
	static int Min=Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		
		arr=new int[N][N];
		visit=new boolean[N];

		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		br.close();
		
		dfs(0,0);
		
		System.out.println(Min);
		
	}
	
	static void dfs(int m, int depth) {
		
		if(depth==N/2) {
			team();
			return;
		}
		
		for(int i=m;i<N;i++) {
			if(!visit[i]) {
				visit[i]=true;
				dfs(i+1,depth+1);
				visit[i]=false;
			}
		}
		
	}
	
	static void team() {
		
		int start=0;
		int link=0;
	
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				if(visit[i]==true&&visit[j]==true) {
					start+=arr[i][j];
					start+=arr[j][i];
				}else if(visit[i]==false&&visit[j]==false) {
					link+=arr[i][j];
					link+=arr[j][i];
				}
			}
		}
		
		int score=Math.abs(start-link);
		
		if(score==0) {
			System.out.println(score);
			System.exit(0);
		}
		
		Min=Math.min(Min, score);		
		
	}

}
