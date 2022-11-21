package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_06_09_2941 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		int count=0;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch>='a'&&ch<='z') {
				count++;
				if(i<(input.length()-1)){
					if((ch=='d'&&input.charAt(i+1)=='z')||((ch=='l'||ch=='n')&&input.charAt(i+1)=='j')) 
						count--;
				}
			}
		}
		
		System.out.println(count);
		
	}

}
