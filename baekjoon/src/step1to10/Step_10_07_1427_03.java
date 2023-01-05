package step1to10;

import java.io.IOException;
import java.io.InputStream;
//https://st-lab.tistory.com/109
public class Step_10_07_1427_03 {

	public static void main(String[] args) throws IOException{
		
		InputStream iStream=System.in;
		
		int[] arr=new int[10];
		int readByte;
		while((readByte=iStream.read())!='\n') 
			arr[readByte-'0']++;			

		StringBuilder sb=new StringBuilder();
		for(int i=9;i>=0;i--){
			while(arr[i]-->0) 
				sb.append(i);
		}
		
		System.out.println(sb);

	}

}
