package step1to10;

import java.util.Scanner;

public class Step_03_13 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		
		int newNum=num;
		int count=0;
		
		while(true) {
			newNum=((newNum/10)+(newNum%10))%10+(newNum%10)*10;
			count++;
			if(num==newNum)
				break;
		}
		
		System.out.println(count);

	}
	
}
