package step1to10;

import java.util.Scanner;

public class Step_03_01 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=9;i++) 
			System.out.println(n+" * "+i+" = "+n*i);
		
	}

}
