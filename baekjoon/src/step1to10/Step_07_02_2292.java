package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_07_02_2292 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int a=1;
		int range=2;
		while(range<=n){
			if(n==1)
				break;
			range=range+(6*a);
			a++;
		}
		System.out.println(a);
	}

}
