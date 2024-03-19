package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_9012 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
	
		StringBuilder sb=new StringBuilder();
		Stack<Character> stack=new Stack<>();
		
		while(T-->0) {
			
			String input=br.readLine();
			
			for(int i=0;i<input.length();i++) {
				char ch=input.charAt(i);
				if(ch=='(') {
					stack.push('(');
				}else {
					if(stack.isEmpty()) {
						stack.push('(');
						break;
					}else {
						stack.pop();						
					}
				}
			}
			
			if(stack.isEmpty()) {
				sb.append("YES").append('\n');
			}else {
				sb.append("NO").append('\n');
			}
			
			stack.clear();

		}
		
		br.close();
		
		System.out.println(sb);

	}

}
