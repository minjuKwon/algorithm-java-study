package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_08_02_2581 {
	
	public static boolean[] prime;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int m=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		prime=new boolean[n+1];
		
		chkPrime(); 
		
		int sum=0;
		int min=Integer.MAX_VALUE;
		for(int i=m;i<=n;i++) {
			if(prime[i]==false) {
				sum+=i;
				if(min==Integer.MAX_VALUE)
					min=i;
			} 
		}
		
		if(sum==0)
			System.out.println(-1);
		else 
			System.out.println(sum+"\n"+min);
		
	}
	
	public static void chkPrime() {
		prime[0]=prime[1]=true;
		for(int i=2;i<=Math.sqrt(prime.length);i++) {
			if(prime[i]) continue;
			for(int j=i*i;j<prime.length;j+=i) {
				prime[j]=true;
			}
		}
	}

}
