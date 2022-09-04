package basic100;

import java.util.Scanner;

public class Basic_042 {

	public static void main(String[] args) {
		
		long a,b;
		
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		scanner.close();
		
		b=++a;
		
		System.out.println(b);
		
	}

}
