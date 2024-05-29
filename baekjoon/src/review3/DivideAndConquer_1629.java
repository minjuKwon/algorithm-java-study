package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DivideAndConquer_1629 {
	
	static int C;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int A=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		C=Integer.parseInt(st.nextToken());
		br.close();
		
		long answer=pow(A, B);

		System.out.println(answer);
		
	}
	
	static long pow(long a, long b) {
		if(b==1) return a%C;
		long value=pow(a, b/2);
		if(b%2==1) return (value*value%C)*a%C;
		return value*value%C;
	}

}
