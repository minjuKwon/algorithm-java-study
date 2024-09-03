package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stack2_9935 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String input=br.readLine();
		String split=br.readLine();
		StringBuilder sb=new StringBuilder();
		
		br.close();
		
		for(int i=0;i<input.length();i++) {
			sb.append(input.charAt(i));
			if(sb.length()>=split.length()) {
				boolean check=true;
				for(int j=0;j<split.length();j++) {
					char ch=sb.charAt(sb.length()-split.length()+j);
					if(split.charAt(j)!=ch) {
						check=false;
						break;
					}
				}
				if(check) {
					sb.delete(sb.length()-split.length(), sb.length());
				}
			}
		}
		
		if(sb.length()==0) {
			System.out.println("FRULA");
		}else {
			System.out.println(sb.toString());
		}

	}

}
