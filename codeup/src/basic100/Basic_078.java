package basic100;

import java.util.Scanner;

public class Basic_078 {

	public static void main(String[] args) {
		
		int a;
		int sum=0;
		int i=1;
		
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		scanner.close();
  
		while(true){	   
		    sum+=i;
		     if(a<=sum){
		        System.out.println(i);
		        break;
		    }
		    i++;
		}

	}

}
