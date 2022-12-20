package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Step_10_02_2587 {

	public static void main(String[] args) throws IOException{
		
		int [] arr=new int[5];
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<arr.length;i++)
			arr[i]=Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
		
		StringBuilder sb=new StringBuilder();
		sb.append(sum/arr.length).append('\n').append(arr[2]);
		System.out.println(sb);

	}

}
