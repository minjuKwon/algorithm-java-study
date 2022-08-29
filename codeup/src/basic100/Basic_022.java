package basic100;

import java.util.Scanner;

public class Basic_022 {

	public static void main(String[] args) {
		
		String [] d=new String[30];
		
		Scanner scanner=new Scanner(System.in);
		
		d=scanner.next().split("");
		
		for(int i=0;i<d.length;i++) {
			System.out.printf("\'%s\'\n",d[i]);
		}
		
		scanner.close();
	}

}
