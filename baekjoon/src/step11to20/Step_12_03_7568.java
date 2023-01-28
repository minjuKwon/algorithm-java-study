package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_12_03_7568 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int[][] person=new int[3][N];
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			person[0][i]=Integer.parseInt(st.nextToken());
			person[1][i]=Integer.parseInt(st.nextToken());
			person[2][i]=1;
		}
		
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				if(person[0][i]>person[0][j]&&person[1][i]>person[1][j]) {
					person[2][j]++;
				}else if(person[0][i]<person[0][j]&&person[1][i]<person[1][j])
					person[2][i]++;
			}
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i:person[2])
			sb.append(i).append(" ");
		System.out.println(sb);
		
	}

}
