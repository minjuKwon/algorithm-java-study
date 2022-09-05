package basic100;

import java.util.Scanner;

public class Basic_047 {

	public static void main(String[] args) {
		
		int a,b;

		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		scanner.close();
		 
		System.out.println(a>b ? 1 : 0);

	}

}
