package basic100;

import java.util.Scanner;

public class Basic_081 {

	public static void main(String[] args) {
		
		int a;
		
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		scanner.close();
		
		for(int i=1;i<=a;i++) {
			if(i%3==0) 
				System.out.print("X ");
			else
				System.out.print(i+" ");
		}
		
	}

}
