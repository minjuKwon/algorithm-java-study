package basic100;

import java.util.Scanner;

public class Basic_025 {

	public static void main(String[] args) {

		String [] date;
		int year,month,day;
		
		Scanner scanner=new Scanner(System.in);
		
		date=scanner.next().split("\\.");
		
		year=Integer.parseInt(date[0]);
		month=Integer.parseInt(date[1]);
		day=Integer.parseInt(date[2]);
		
		System.out.printf("%02d-%02d-%04d",day,month,year);
		
		scanner.close();

	}

}
