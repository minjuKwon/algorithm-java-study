package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dp1_1932 {
	
	static int N;
	static int [][] arr;
	static Integer [][] value;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		arr=new int[N][N];		
		value=new Integer[N][N];
		
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<=i;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		br.close();
		
		for(int i=0;i<N;i++) {
			value[N-1][i]=arr[N-1][i];
		}
		
		int result=getMax(0, 0);
		
		System.out.println(result);

	}
	
	static int getMax(int depth, int m) {
		if(depth==N-1) {
			return value[depth][m];
		}
		if(value[depth][m]==null) {
			value[depth][m]=Math.max(getMax(depth+1, m), getMax(depth+1,m+1))+arr[depth][m];
		}
		return value[depth][m];
	}
	
}
