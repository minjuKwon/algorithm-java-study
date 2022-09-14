package basic100;

import java.util.Scanner;

public class Basic_091 {

	public static void main(String[] args) {
		
		int n,num;
		int []arr=new int [24];
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			num=sc.nextInt();
			arr[num]+=1;
		}
		
		sc.close();
		
		for(int i=1;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
