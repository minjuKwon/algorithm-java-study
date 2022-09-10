package basic100;

import java.util.Scanner;

public class Basic_079 {

	public static void main(String[] args) {
		
		int n,m;
		
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		m=scanner.nextInt();
		scanner.close();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.println(i+" "+j);
			}
		}
		
	}

}
