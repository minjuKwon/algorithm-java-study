package basic100;

import java.util.Scanner;

public class Basic_023 {

	public static void main(String[] args) {
		
		String prenum;
		int digit=10000;
		
		Scanner scanner=new Scanner(System.in);
		
		prenum=scanner.next();
		
		int [] postnum=new int[prenum.length()];
		
		for(int i=0;i<prenum.length();i++) {
				postnum[i]=prenum.charAt(i)- '0';
				System.out.println("["+(postnum[i]*digit)+"]");
				digit/=10;
		}
		
		scanner.close();

	}

}
