package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion_27433 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println(recursion(N));

	}
	
	static long recursion(int n) {
		if(n<2) {
			return 1;
		}return n*recursion(n-1);
	}

}
