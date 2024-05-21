package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PreFixSum_11660 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int [][] arr=new int[N+1][N+1];
		for(int i=1;i<=N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=1;j<=N;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken())+arr[i-1][j];
			}
		}
		
		StringBuilder sb=new StringBuilder();
		while(M-->0) {
			st=new StringTokenizer(br.readLine());
			
			int x1=Integer.parseInt(st.nextToken());
			int y1=Integer.parseInt(st.nextToken());
			int x2=Integer.parseInt(st.nextToken());
			int y2=Integer.parseInt(st.nextToken());
			
			int sum=0;
			for(int i=y1;i<=y2;i++) {
				sum+=arr[x2][i]-arr[x1-1][i];
			}
			
			sb.append(sum).append('\n');
		}
		
		br.close();
		
		System.out.println(sb);

	}

}
