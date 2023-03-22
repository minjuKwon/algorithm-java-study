package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_10808 {

	public static void main(String[] args) throws IOException{
		
		int [] arr=new int[26];
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();

		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)-'a']++;
		}
		
		br.close();
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<26;i++) {
			sb.append(arr[i]).append(' ');
		}
		
		System.out.println(sb);
		
	}

}
