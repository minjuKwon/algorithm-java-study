package basic100;

import java.util.Scanner;

public class Basic_044 {

	public static void main(String[] args) {
		
		int num1,num2,num3;
		int sum=0;
		
		Scanner scanner=new Scanner(System.in);
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		num3=scanner.nextInt();
		scanner.close();
		
		sum=num1+num2+num3;
		
		System.out.println(sum);
		System.out.printf("%.1f",(float)sum/3);

	}

}
