package basic100;

import java.util.Scanner;

public class Basic_021 {

	public static void main(String[] args) {
		
		String [] number;
		
		Scanner scanner=new Scanner(System.in);
		
		number=scanner.nextLine().split("\\.");
		
		System.out.println(number[0]+"\n"+number[1]);
		
		scanner.close();

	}

}
