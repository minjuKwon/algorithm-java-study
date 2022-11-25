package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_07_02_2292 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int answer=(n-1)/6;
		int a=1;
		int sum=1;
		while(sum<=answer){
			a++;
			sum+=a;
		}
		System.out.println(a);
	}

}
