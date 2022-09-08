package basic100;

import java.util.Scanner;

public class Basic_065 {

	public static void main(String[] args) {
	
		int a;
		
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		scanner.close();
		
		if(a>0){
			if(a%2==0)
				System.out.println("plus\neven");	
			else
				System.out.println("plus\nodd");
		}
		else{
			if(a%2==0)
				System.out.println("minus\neven");	
			else
				System.out.println("minus\nodd");
			
		}
		
		/*
		 * if(a>0) System.out.println("plus"); else System.out.println("minus");
		 * if(a%2==0) System.out.println("even"); else System.out.println("odd");
		 */
			
		
	}

}
