package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Combination_24723 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println((int)Math.pow(2, N));

	}

}
