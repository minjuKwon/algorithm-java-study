package step1to10;

import java.util.Scanner;

public class Step_05_03_1065_02 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(hansu(sc.nextInt()));
		sc.close();
	}
	
	public static int hansu(int num) {
		int count=0;
		if(num<100)
			return num;
		else {
			count=99;
			int n1,n2,n3;
			for(int i=100;i<=num;i++) {
				n3=i/100;
				n2=(i/10)%10;
				n1=i%10;
				if((n3-n2)==(n2-n1))
					count++;
				}	
		   }
		return count;
	}

}
