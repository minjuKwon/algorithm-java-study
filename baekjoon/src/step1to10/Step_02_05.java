package step1to10;

import java.util.Scanner;

public class Step_02_05 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt();
		int M=sc.nextInt();
		sc.close();
	
		if(M<45) {
			M=(M+60)-45;
			if(H==0)
				H=23;
			else
				H--;
		}else
			M=M-45;
		System.out.println(H+" "+M);
		
	}

}
