package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Step_10_06_2108_02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int sum=0;
		int [] arr=new int[N];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			sum+=arr[i];
		}
		
		Arrays.sort(arr);
	
		int mode=5000;
		int max_mode=0;
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++) {
			
			int count=1;
			int jump=0;
			int num=arr[i];
			
			for(int j=1+i;j<arr.length;j++) {
				if(num!=arr[j])
					break;
				count++;
				jump++;
			}
			
			if(count>max_mode) {
				max_mode=count;
				mode=num;
				flag=true;
			}
			else if(count==max_mode&&flag==true) {
				mode=num	;
				flag=false;	
			}
			
			i+=jump;
			
		}
		
		System.out.println((int)Math.round((double)sum/N));
		System.out.println(arr[N/2]);
		System.out.println(mode);
		System.out.println(arr[N-1]-arr[0]);

	}

}
