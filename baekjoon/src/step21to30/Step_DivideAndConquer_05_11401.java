package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/241
public class Step_DivideAndConquer_05_11401 {
	
	final static long VALUE=1000000007;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		long N=Long.parseLong(st.nextToken());
		long K=Long.parseLong(st.nextToken());
		
		br.close();
		
		long numerator=factorial(N);
		long denominator=factorial(K)*factorial(N-K)%VALUE;
		long result=numerator*pow(denominator,VALUE-2)%VALUE;
		
		System.out.println(result);
		
	}

	static long factorial(long N) {
		
		long num=1L;
		
		while(N>1) {
			num=(num*N)%VALUE;
			N--;
		}
		
		return num;
		
	}
	
	static long pow(long num, long exponent) {
		
		if(exponent==1) {
			return num%VALUE;
		}
		
		long temp=pow(num,exponent/2);
		
		if(exponent%2==1) {
			return (temp*temp%VALUE)*num%VALUE;
		}
		
		return temp*temp%VALUE;
		
	}
	
}
