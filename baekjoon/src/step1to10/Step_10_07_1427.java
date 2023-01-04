package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Step_10_07_1427 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String N=br.readLine();
		
		int arr[]=new int[11];
		for(int i=0;i<N.length();i++)
			arr[N.charAt(i)-'0']++;
		br.close();
		
		StringBuilder sb=new StringBuilder();
		for(int i=arr.length-1;i>=0;i--) {
			while(arr[i]>0) {
				sb.append(i);
				arr[i]--;				
			}
		}
		
		System.out.println(sb);
		
	}

}
