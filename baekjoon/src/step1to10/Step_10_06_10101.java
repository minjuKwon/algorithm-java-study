package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_10_06_10101 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int c=Integer.parseInt(br.readLine());
		br.close();
		
		if(a+b+c!=180) {
			System.out.println("Error");
		}else if(a==b&&b==c) {
			System.out.println("Equilateral");
		}else if(a==b||b==c||a==c) {
			System.out.println("Isosceles");
		}else {
			System.out.println("Scalene");
		}
	
	}

}
