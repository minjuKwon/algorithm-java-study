package basic100;

import java.util.Scanner;

public class Basic_085 {

	public static void main(String[] args) {
		
		int num;
		int i=1; int sum=0;
		
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		sc.close();
		
		while(true) {
			sum+=i;
			i++;
			if(sum>=num) {
				break;
			}
		}
		
		System.out.println(sum);
		
	}

}
