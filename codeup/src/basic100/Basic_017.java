package basic100;

import java.util.Scanner;

public class Basic_017 {

	public static void main(String[] args) {
		String [] date;
		int year,month,day;
		
		Scanner scanner=new Scanner(System.in);
		
		date=scanner.nextLine().split("\\.");
		
		year=Integer.parseInt(date[0]);
		month=Integer.parseInt(date[1]);
		day=Integer.parseInt(date[2]);
				
		System.out.printf("%04d.%02d.%02d",year,month,day);
		
		scanner.close();

	}

}
