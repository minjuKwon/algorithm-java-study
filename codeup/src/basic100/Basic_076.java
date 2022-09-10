package basic100;

import java.util.Scanner;

public class Basic_076 {

	public static void main(String[] args) {
		int a;
		int sum=0;
		
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		scanner.close();
		
		for(int i=1;i<=a;i++){
		    if(i%2==0){
		        sum+=i;
		    }
		}
		System.out.println(sum);

	}

}
