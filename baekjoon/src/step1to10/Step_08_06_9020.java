package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_08_06_9020 {

	static boolean [] prime=new boolean[10001];
	
	public static void main(String[] args) throws IOException{
		
		chk_prime();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int T=Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			int n=Integer.parseInt(br.readLine());
			for(int j=n/2;j>1;j--) {
				if(!prime[j]) {
					if(!prime[n-j]) {
						sb.append(j).append(' ').append(n-j).append('\n');
						break;
					}
				}
			}
		}
		
		System.out.println(sb);

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
