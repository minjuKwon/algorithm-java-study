package basic100;

import java.util.Scanner;


public class Basic_052 {

	public static void main(String[] args) {
		
		int a,b;

		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		scanner.close();

		System.out.println(a==1&&b==1 ? 1 : 0);
	}

}
