package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Step_10_04_2751 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int [] arr=new int[N];
		for(int i=0;i<arr.length;i++)
			arr[i]=Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		
		StringBuilder sb=new StringBuilder();
		for (int num : arr) {
			sb.append(num).append('\n');
		}
		
		System.out.println(sb);

	}

}
