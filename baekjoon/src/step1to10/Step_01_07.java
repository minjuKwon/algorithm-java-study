package step1to10;

import java.util.Scanner;

public class Step_01_07 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		sc.close();

		System.out.print((A+B)+"\n"+(A-B)+"\n"+(A*B)+"\n"+(A/B)+"\n"+(A%B));
	}

}
