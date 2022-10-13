package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_04_06 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		double sum=0;
		double count=0;
		int [][] scores=new int[n][];
		StringTokenizer st;
		
		for(int i=0;i<n;i++) {
			sum=0;
			count=0;
			st=new StringTokenizer(br.readLine());
			int m=Integer.parseInt(st.nextToken());
			scores[i]=new int[m];
			
			for(int j=0;j<m;j++) {
				scores[i][j]=Integer.parseInt(st.nextToken());
				sum+=scores[i][j];
			}
			for(int j=0;j<m;j++) {
				if(scores[i][j]>(sum/m))
					count++;
			}
			System.out.printf("%.3f%%\n",(count/m)*100);
		}
		
	}

}
