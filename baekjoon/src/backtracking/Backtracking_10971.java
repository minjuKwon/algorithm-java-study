package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backtracking_10971 {

	static int [][] arr;
	static boolean[] visited;
	static int N;
	static int min=Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		
		arr=new int[N][N];
		visited=new boolean[N];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		br.close();
		
		//결론적으로 모든 도시를 돌기 때문에
		//어느 곳에서 시작하든 똑같이 최소 값이 나옴
		visited[0]=true;
		BT(0,0,0);	
		
		System.out.println(min);
		
	}
	
	static void BT(int depth,int currentPosition,int cost) {
		
		if(depth==N-1) {
			if(arr[currentPosition][0]!=0) {
				min=Math.min(min, cost+arr[currentPosition][0]);				
			}
			return;
		}
		
		for(int i=1;i<N;i++) {
			if(!visited[i]&&arr[currentPosition][i]!=0) {
				visited[i]=true;
				BT(depth+1,i,cost+arr[currentPosition][i]);
				visited[i]=false;
			}				
		}
		
	}

}
