package step1to10;

import java.util.Scanner;

public class Step_04_01 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		
		for(int i=0;i<n;i++) 
			arr[i]=sc.nextInt();
		
		sc.close();
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		for(int i=0;i<n;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		
		System.out.println(min+" "+max);	

	}

}
