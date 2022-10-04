package step1to10;

import java.util.Scanner;

public class Step_02_01 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		sc.close();
		
		if(A>B)System.out.println(">");
		if(A<B)System.out.println("<");
		if(A==B)System.out.println("==");

	}

}
