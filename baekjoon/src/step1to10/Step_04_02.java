package step1to10;

import java.util.Scanner;

public class Step_04_02 {

	public static void main(String[] args) {
		
		int [] arr=new int [10];
		int max=Integer.MIN_VALUE;
		int num=0;
		
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<arr.length;i++) 
			arr[i]=sc.nextInt();
		sc.close();
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				num=i;				
			}
		}
		
		System.out.println(max+"\n"+num);
	}

}
