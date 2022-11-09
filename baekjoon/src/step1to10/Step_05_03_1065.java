package step1to10;

import java.util.Scanner;

public class Step_05_03_1065 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.close();
		
		int count=0;
		int n1,n2,n3,n4;
        for(int i=1;i<=N;i++) {
        	n4=i/1000;
        	n3=(i/100)%10;
        	n2=(i/10)%10;
        	n1=i%10;
        	if(n1!=0&&n2==0&&n3==0&&n4==0)
        		count++;
        	else if(n2!=0&&n3==0&&n4==0)
        		count++;
        	else if(n3!=0&&n4==0) {
        		if((n3-n2)==(n2-n1))
        			count++;
        	}
        }
        System.out.println(count);
	}

}
