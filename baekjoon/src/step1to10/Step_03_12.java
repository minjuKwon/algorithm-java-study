package step1to10;

import java.util.Scanner;

public class Step_03_12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext())
			System.out.println(sc.nextInt()+sc.nextInt());
			
		sc.close();

	}
}
