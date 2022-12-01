package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_07_06_2775 {

	public static void main(String[] args) throws IOException{
		
		int [][] apartment;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			int k=Integer.parseInt(br.readLine());
			int n=Integer.parseInt(br.readLine());
			apartment=new int[k+1][n+1];
			for(int a=0;a<=k;a++) {
				for(int b=1;b<=n;b++) {
					if(a==0) {
						apartment[a][b]=b;
					}else {
						if(b==1) {
							apartment[a][b]=1;
						}else {
							for(int c=1;c<=b;c++)
								apartment[a][b]+=apartment[a-1][c];							
						}
					}	
				}
			}

			System.out.println(apartment[k][n]);
		}
		

	}

}
