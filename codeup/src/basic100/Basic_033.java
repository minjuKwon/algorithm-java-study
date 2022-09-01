package basic100;

import java.util.Scanner;

public class Basic_033 {

	public static void main(String[] args) {
		
		String a;
		int hexadecimalNum; 
		
		Scanner scanner=new Scanner(System.in);
		a=scanner.next();
		scanner.close();
		
		hexadecimalNum=Integer.parseInt(a,16);
		
		System.out.printf("%o",hexadecimalNum);
		
	}

}
