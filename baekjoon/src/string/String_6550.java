package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_6550 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		while(true) {
			String input=br.readLine();
			if(input==null||input.equals("")) break;
			
			String [] arr= input.split(" ");
			String s=arr[0];
			String t=arr[1];
			int idx=0;
			
			for(int i=0;i<t.length();i++) {
				if(s.charAt(idx)==t.charAt(i)) idx++;
				if(idx==s.length()) break;
			}
			
			if(idx==s.length()) sb.append("Yes").append('\n');
			else sb.append("No").append('\n');
		}
		br.close();
		
		System.out.println(sb);

	}

}