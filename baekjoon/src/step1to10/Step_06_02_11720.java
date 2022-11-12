package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_06_02_11720 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int sum=0;
		String num=br.readLine();
		for(int i=0;i<n;i++) {
			sum+=num.charAt(i)-'0';
		}
		
		System.out.println(sum);
		
	}

}
