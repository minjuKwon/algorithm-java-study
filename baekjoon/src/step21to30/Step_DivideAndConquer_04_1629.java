package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/237
public class Step_DivideAndConquer_04_1629 {

	static long C;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		long A=Long.parseLong(st.nextToken());
		long B=Long.parseLong(st.nextToken());
		C=Long.parseLong(st.nextToken());
		
		br.close();
		
		long result=pow(A,B);
		
		System.out.println(result);

	}
	
	static long pow(long a, long b) {
		
		if(b==1) {
			return a%C;
		}
		
		long value=pow(a,b/2);
		
		if(b%2==1) {
			return (value*value%C)*a%C;
		}	
		return value*value%C;
	
	}

}
