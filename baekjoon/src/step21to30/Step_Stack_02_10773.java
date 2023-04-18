package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_Stack_02_10773 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int [] arr=new int[N];
		int size=0;
		
		while(N-->0) {
			int num=Integer.parseInt(br.readLine());
			if(num==0) {
				arr[--size]=0;
			}else {
				arr[size]=num;
				++size;
			}
		}
		
		br.close();
		
		int sum=0;
		for(int a:arr) {
			sum+=a;
		}
		
		System.out.println(sum);
		
	}

}
