package basic100;

import java.util.Scanner;

public class Basic_014 {

	public static void main(String[] args) {
		float n;
		
		Scanner s=new Scanner(System.in);
		
		n=s.nextFloat();
		
		System.out.println(String.format("%.2f", n));
		s.close();

	}

}
