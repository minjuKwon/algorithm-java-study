package basic100;

import java.util.Scanner;

public class Basic_086 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=num;i++) {
			if(i%3==0)
				continue;
			System.out.print(i+" ");
		}

	}

}
