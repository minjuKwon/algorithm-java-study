package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_Recursive_01_27433 {

	public static void main(String[] args) throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		long answer=recursive(N);
		
		System.out.println(answer);

	}
	
	static long recursive (int n) {
		if(n<2)
			return 1;
		return n*recursive(n-1);
		
	}

}
