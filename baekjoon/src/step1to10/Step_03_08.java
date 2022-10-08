package step1to10;

import java.util.Scanner;

public class Step_03_08 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=n;i++)
			System.out.println("*".repeat(i));

	}

}
