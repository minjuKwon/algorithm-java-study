package basic100;

import java.util.Scanner;

public class Basic_073 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		scanner.close();
		
		while(num!=0){
		    num--;
		    System.out.println(num);
		}

	}

}
