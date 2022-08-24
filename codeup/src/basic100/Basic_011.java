package basic100;

import java.util.Scanner;

public class Basic_011 {

	public static void main(String[] args) {
		float n;
		Scanner s=new Scanner(System.in);
		n=s.nextFloat();
		System.out.println(String.format("%.6f", n));
		s.close();
	}

}
