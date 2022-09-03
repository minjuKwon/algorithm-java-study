package basic100;

import java.util.Scanner;

public class Basic_039 {

	public static void main(String[] args) {
		
		char num,nexNum;
		
		Scanner scanner=new Scanner(System.in);
		num=scanner.next().charAt(0);
		scanner.close();
		
		nexNum=(char)(num+1);
		
		System.out.println(nexNum);

	}

}
