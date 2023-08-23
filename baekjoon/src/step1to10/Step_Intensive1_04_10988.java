package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_Intensive1_04_10988 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String input=br.readLine();
		
		int len=input.length();
		int result=1;
		
		for(int i=0;i<len;i++) {
			char ch=input.charAt(i);
			if(ch!=input.charAt(len-i-1)) {
				result=0;
				break;
			}
		}
		
		System.out.println(result);

	}

}
