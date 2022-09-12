package basic100;

import java.util.Scanner;

public class Basic_084 {

	public static void main(String[] args) {
		
		  long w,h,b; 
		  double pixel = 0;
		  
		  Scanner sc = new Scanner(System.in); 
		  w = sc.nextLong();
		  h = sc.nextLong(); 
		  b = sc.nextLong(); 
		  sc.close();
		  
		  pixel = w * h * b / Math.pow(2, 23);
		  
		  System.out.printf("%.2f MB", pixel);

	}

}
