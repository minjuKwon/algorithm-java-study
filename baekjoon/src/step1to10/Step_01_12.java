package step1to10;

import java.util.Scanner;

public class Step_01_12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		sc.close();
		
		System.out.println(A*(B%10));
		System.out.println(A*((B/10)%10));
		System.out.println(A*(B/100));
		System.out.println(A*B);
		
	}

}
