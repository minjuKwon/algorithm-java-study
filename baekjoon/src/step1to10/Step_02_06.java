package step1to10;

import java.util.Scanner;

public class Step_02_06 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt();
		int M=sc.nextInt();
		int plusM=sc.nextInt();
		sc.close();
	
		int mok=(M+plusM)/60;
		if(mok>0) {
			M=(M+plusM)%60;
			H+=mok;
			if(H>=24)
				H-=24;
		}	
		else
			M=M+plusM;
		
		System.out.println(H+" "+M);
		
	}

}
