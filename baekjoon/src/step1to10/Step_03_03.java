package step1to10;

import java.util.Scanner;

public class Step_03_03 {

	public static void main(String[] args) {
		
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		
		System.out.println(sum);

	}

}
