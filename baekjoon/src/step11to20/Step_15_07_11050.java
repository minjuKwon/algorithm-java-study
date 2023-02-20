package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_15_07_11050 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		System.out.println(factorial(N)/(factorial(N-K)*factorial(K)));

	}
	
	static int factorial(int n) {
		if(n<2)
			return 1;
		return n* factorial(n-1);
	}
	
}
