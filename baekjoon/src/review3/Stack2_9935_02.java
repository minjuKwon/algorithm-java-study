package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack2_9935_02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		String split=br.readLine();
		br.close();
		
		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<input.length();i++) {
			
			stack.push(input.charAt(i));
			
			if(stack.size()>=split.length()) {
				boolean check=true;
				for(int j=0;j<split.length();j++) {
					if(stack.get(stack.size()-split.length()+j)!=split.charAt(j)) {
						check=false;
						break;
					}
				}
				if(check) {
					for(int j=0;j<split.length();j++) {
						stack.pop();
					}
				}
			}
			
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(Character ch:stack) {
			sb.append(ch);
		}
		
		if(sb.length()==0) {
			System.out.println("FRULA");
		}else {
			System.out.println(sb);
		}

	}

}
