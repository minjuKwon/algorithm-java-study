package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_10_01_2750_03 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int [] arr=new int [N];
		for(int i=0;i<arr.length;i++)
			arr[i]=Integer.parseInt(br.readLine());
		
		//insertion sort
		int temp;
		for (int i = 1; i < arr.length; i++) {
			int key=i;
			for (int j = i-1; j >= 0; j--) {
				if(arr[key]<arr[j]) {
					temp=arr[key];
					arr[key]=arr[j];
					arr[j]=temp;
					key=j;
				}
			}
		}
		
		StringBuilder sb=new StringBuilder();
		for(int num:arr)
			sb.append(num).append('\n');
		
		System.out.println(sb);

	}

}
