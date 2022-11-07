package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_05_03_2563 {

	public static void main(String[] args) throws IOException{
		
		int [][] paper=new int[100][100];
		int count=0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a,b;
		StringTokenizer st;
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine());
			a=Integer.parseInt(st.nextToken());
			b=Integer.parseInt(st.nextToken());
			
			for(int j=a;j<a+10;j++) {
				for(int k=b;k<b+10;k++) {
					paper[j][k]=1;
				}
			}
		}
		
		for(int i=0;i<paper.length;i++) {
			for(int j=0;j<paper[i].length;j++) {
				if(paper[i][j]==1)
					count++;
			}
		}
		System.out.println(count);

	}

}
