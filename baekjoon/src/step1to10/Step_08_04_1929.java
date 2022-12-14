package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_08_04_1929 {
	
	static boolean [] prime;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int M=Integer.parseInt(st.nextToken());
		int N=Integer.parseInt(st.nextToken());
		
		prime=new boolean[N+1];
		chkPrime();
		
		for(int i=M;i<=N;i++) {
			if(prime[i]==false)
				System.out.println(i);
		}
		
	}
	
	static void chkPrime() {
		prime[0]=prime[1]=true;
		for(int i=2;i<=Math.sqrt(prime.length);i++) {
			if(prime[i]==true)continue;
			for(int j=i*i;j<prime.length;j+=i) {
				prime[j]=true;
			}
		}
	}

}
