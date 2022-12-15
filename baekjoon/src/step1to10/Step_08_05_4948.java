package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_08_05_4948 {
	static boolean[] prime;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			int n=Integer.parseInt(br.readLine());
			if(n==0) break;
			prime=new boolean[(n*2)+1];
			
			chk_prime();
			
			int count=0;
			for(int i=n+1;i<=2*n;i++) {
				if(prime[i]==false)
					count++;
			}
			
			System.out.println(count);
		}

	}
	
	static void chk_prime() {
		prime[0]=prime[1]=true;
		for(int i=2;i<=Math.sqrt(prime.length);i++) {
			if(prime[i]==true)continue;
			for(int j=i*i;j<prime.length;j+=i) {
				prime[j]=true;
			}
		}
	}

}
