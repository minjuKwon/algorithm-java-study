package basic100;

import java.util.Scanner;

public class Basic_032 {

	public static void main(String[] args) {
		
		String a;
		int octalNum; 
		
		Scanner scanner=new Scanner(System.in);
		a=scanner.next();
		scanner.close();
		
		octalNum=Integer.parseInt(a,8);
		
		System.out.printf("%d",octalNum);
		
	}

}
