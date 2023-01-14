package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_11_01_10872 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int num=factorial(N);
		System.out.println(num);
		
	}
	
	public static int factorial(int n) {
		if(n<2)
			return 1;
		else
			return n*factorial(n-1);
	} 

}
