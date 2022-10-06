package step1to10;

import java.util.Scanner;

public class Step_02_06_02 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		sc.close();
		
		int M=B+(A*60)+C;
		int H=(M/60)%24;
		M=M%60;
		
		System.out.println(H+" "+M);
	}

}
