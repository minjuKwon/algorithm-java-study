package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_11_02_10870 {

	public static void main(String[] args)  throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int num=fibonacci(n);
		
		System.out.println(num);
		
	}
	
	public static int fibonacci(int n) {
		if(n<2)
			return n;
		else 
			return fibonacci(n-1)+fibonacci(n-2);
	}

}
