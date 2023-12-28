package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion_10870 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println(fibonaci(N));

	}
	
	static int fibonaci(int n) {
		if(n<2) {
			return n;
		}return fibonaci(n-1)+fibonaci(n-2);
	}

}
