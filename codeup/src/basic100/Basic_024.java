package basic100;

import java.util.Scanner;

public class Basic_024 {

	public static void main(String[] args) {
		
		String [] time;
		
		Scanner scanner=new Scanner(System.in);
		
		time=scanner.next().split(":");
		System.out.println(Integer.parseInt(time[1]));
		
		scanner.close();

	}

}
