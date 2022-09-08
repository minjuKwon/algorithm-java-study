package basic100;

import java.util.Scanner;

public class Basic_074 {

	public static void main(String[] args) {
		
		char firstT='a';
		char text;
		
		Scanner scanner=new Scanner(System.in);
	    text=scanner.next().charAt(0);
	    
	    do{
	        System.out.print(firstT+" ");
	        firstT+=1;
	    }while(firstT<=text);

	}

}
