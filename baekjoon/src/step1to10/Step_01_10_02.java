package step1to10;

import java.util.Scanner;

public class Step_01_10_02 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		for(int i: new int[] {1,1,2,2,2,8}) {
			System.out.print(i-sc.nextInt()+" ");
		}
		sc.close();

	}

}
