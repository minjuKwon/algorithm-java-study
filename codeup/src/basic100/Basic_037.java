package basic100;

import java.util.Scanner;

public class Basic_037 {

	public static void main(String[] args) {
	
		long num1,num2,sum;
		
		Scanner scanner=new Scanner(System.in);
		num1=scanner.nextLong();
		num2=scanner.nextLong();
		scanner.close();
		
		sum=num1+num2;
		
		System.out.println(sum);
		
	}

}
