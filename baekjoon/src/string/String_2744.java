package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_2744 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char [] arr= br.readLine().toCharArray();
		br.close();
		
		StringBuilder sb=new StringBuilder();
		
		for(char ch:arr) {
			if(ch>='a'&&ch<='z') sb.append((char)(ch-'a'+'A'));
			else sb.append((char)(ch-'A'+'a'));
		}
		
		System.out.println(sb.toString());

	}

}
