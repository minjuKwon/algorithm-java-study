package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://st-lab.tistory.com/165
public class Step_15_11_1676 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int count=0;
		while(N>=5) {
			count+=N/5;
			N/=5;
		}
		
		System.out.println(count);

	}

}
