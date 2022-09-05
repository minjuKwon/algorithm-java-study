package basic100;

import java.util.Scanner;

public class Basic_051 {

	public static void main(String[] args) {
		
		int a;
		
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		scanner.close();

		System.out.println(a==1 ? 0 : 1);

	}

}
