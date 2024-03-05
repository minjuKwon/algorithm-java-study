package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backtracking_14889 {
	
	static int arr[][];
	static boolean [] isVisited;
	static int N;
	static int min=Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		arr=new int[N][N];
		isVisited=new boolean[N];
		
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		br.close();
		
		dfs(0,0);
		
		System.out.println(min);

	}
	
	static void dfs(int start, int depth) {
		
		if(depth==N/2) {
			makeTeam();
			return;
		}
		
		for(int i=start;i<N;i++) {
			if(!isVisited[i]) {
				isVisited[i]=true;
				dfs(i+1, depth+1);
				isVisited[i]=false;
			}
		}
		
	}
	
	static void makeTeam() {
		
		int startTeam=0;
		int linkTeam=0;
		
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				if(isVisited[i]&&isVisited[j]) {
					startTeam+=arr[i][j];
					startTeam+=arr[j][i];
				}else if(!isVisited[i]&&!isVisited[j]){
					linkTeam+=arr[i][j];
					linkTeam+=arr[j][i];
				}
			}
		}
		
		int score=Math.abs(startTeam-linkTeam);
		
		if(score==0) {
			System.out.println(score);
			System.exit(0);
		}
		
		min=Math.min(min, score);
			
	}

}
