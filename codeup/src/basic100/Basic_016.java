package basic100;

import java.util.Scanner;

public class Basic_016 {

	public static void main(String[] args) {
		
		String click;
		
		Scanner scanner=new Scanner(System.in);
		
		click=scanner.nextLine();
		
		String [] time=click.split(":");
		
		System.out.printf("%s:%s",time[0],time[1]);
		
		scanner.close();
		
	}

}
