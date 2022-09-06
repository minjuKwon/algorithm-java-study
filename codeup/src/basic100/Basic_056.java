package basic100;

import java.util.Scanner;

public class Basic_056 {

	public static void main(String[] args) {
		
		int num1,num2;
		boolean a,b;
		
		Scanner scanner=new Scanner(System.in);
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		scanner.close();
		
		a = num1==0 ? false : true;
		b = num2==0 ? false : true;
		
		System.out.println(!(a||b) ? 1 : 0);

	}

}
