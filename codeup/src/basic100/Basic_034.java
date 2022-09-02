package basic100;

import java.util.Scanner;

public class Basic_034 {

	public static void main(String[] args) {


		char e;
		int a;
		
		Scanner scanner=new Scanner(System.in);
		e=scanner.next().charAt(0);
		scanner.close();
		
		a=(byte)e;
		
		System.out.println(a);

	}

}
