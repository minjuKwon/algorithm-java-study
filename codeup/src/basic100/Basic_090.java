package basic100;

import java.util.Scanner;

public class Basic_090 {

	public static void main(String[] args) {
		
		int a,b,c;
		int day=1;
		
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		sc.close();
		
		while(true) {
			if(day%a==0&&day%b==0&&day%c==0) {
				break;
			}
			day++;
		}
		System.out.println(day);

	}

}
