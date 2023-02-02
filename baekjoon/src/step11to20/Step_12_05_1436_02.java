package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://st-lab.tistory.com/103
public class Step_12_05_1436_02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int num=666;
		int count=1;
		while(count!=N) {
			num++;
			if(String.valueOf(num).contains("666")) 
				count++;
		}
		
		System.out.println(num);

	}
}
