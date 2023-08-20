package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_TimeComplexity_05_24266 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		long N=Long.parseLong(br.readLine());
		
		System.out.println(N*N*N+"\n"+3);

	}

}
