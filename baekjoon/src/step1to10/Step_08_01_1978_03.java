package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_08_01_1978_03 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int [] num=new int[n];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			num[i]=Integer.parseInt(st.nextToken());
		};
		
		boolean [] prime=new boolean[1001];
		prime[0]=prime[1]=true;
		
		
		int count=0;
			
//			for(int j=2;j<=Math.sqrt(a);j++) {
//				if(prime[i]==true)
//					continue;
//				for(int k=j*j;k<=a;k++) {
//					prime[j]=true;
//				}
//				
//			}
		

	}

}
