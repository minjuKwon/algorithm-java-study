package basic100;

import java.util.Scanner;

public class Basic_087 {

	public static void main(String[] args) {
		
		int a,d,n;
		int num=0;
		
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		d=sc.nextInt();
		n=sc.nextInt();
		sc.close();
		
		num=a+d*(n-1);
		
		System.out.println(num);
		
	}

}
