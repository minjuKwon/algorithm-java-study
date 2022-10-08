package step1to10;

import java.util.Scanner;

public class Step_03_04 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int account=sc.nextInt();
		int N=sc.nextInt();	
		
		int item,n;
		int sum=0;
		for (int i=0;i<N;i++) {
			item=sc.nextInt();
			n=sc.nextInt();
			sum+=(item*n);
		}		
		sc.close();
		
		if(account==sum)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
