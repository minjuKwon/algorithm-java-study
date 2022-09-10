package basic100;

import java.util.Scanner;

public class Basic_077 {

	public static void main(String[] args) {
		
		char text='a';
		
		Scanner scanner=new Scanner(System.in);
	    
	    while(text!='q'){
	        text=scanner.next().charAt(0);
	        System.out.println(text);
	    }
	    scanner.close();

	}

}
