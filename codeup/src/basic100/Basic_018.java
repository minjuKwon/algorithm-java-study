package basic100;

import java.util.Scanner;

public class Basic_018 {

	public static void main(String[] args) {
		
		String [] juminNum;
		
		Scanner scanner=new Scanner(System.in);
		
		juminNum=scanner.next().split("-");
		
		System.out.println(juminNum[0]+""+juminNum[1]);
		scanner.close();
	}

}
