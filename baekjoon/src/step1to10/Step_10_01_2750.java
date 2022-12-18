package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_10_01_2750 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int [] arr=new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		int num;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					num=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=num;
				}
			}
		}
		
		StringBuilder sb=new StringBuilder();
		for(int a:arr) {
			sb.append(a).append('\n');
		}
		System.out.println(sb);

	}

}
