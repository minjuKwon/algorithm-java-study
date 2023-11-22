package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_10798 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		final int LEN=5;
		char [][] arr=new char [LEN][15];
		
		String input;
		int maxLen=0;
		for(int i=0;i<LEN;i++) {
			input=br.readLine();
			maxLen= input.length()>maxLen ? input.length(): maxLen;
			for(int j=0;j<input.length();j++) {
				arr[i][j]=input.charAt(j);
			}
		}
		
		br.close();
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<maxLen;i++) {
			for(int j=0;j<LEN;j++) {
				if(arr[j][i]!='\0') {					
					sb.append(arr[j][i]);
				}
			}
		}
		
		System.out.println(sb);

	}

}
