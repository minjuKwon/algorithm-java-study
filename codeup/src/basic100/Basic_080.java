package basic100;

import java.util.Scanner;

public class Basic_080 {

	public static void main(String[] args) {
		
		String num;
		int hexadecimalNum; 
		
		Scanner scanner=new Scanner(System.in);
		num=scanner.next();
		scanner.close();
		
		hexadecimalNum=Integer.parseInt(num,16);
		
		for(int i=1;i<16;i++) {
			System.out.printf("%X*%X=%X\n",hexadecimalNum,i,hexadecimalNum*i);
		}
		
	}

}
