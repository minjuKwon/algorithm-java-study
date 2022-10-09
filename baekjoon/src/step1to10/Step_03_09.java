package step1to10;

import java.util.Scanner;

public class Step_03_09 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		for(int i=n-1;i>=0;i--) 
			System.out.println(" ".repeat(i)+"*".repeat(n-i));
		
	}

}
