package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class String_9093_2 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		Stack<Character> stack;
		int T=Integer.parseInt(br.readLine());
		
		while(T-->0) {
			
			stack=new Stack<>();
			String input=br.readLine()+"\n";
			
			for(char ch:input.toCharArray()) {
				if(ch==' '||ch=='\n') {
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(' ');
				}else {
					stack.push(ch);
				}
			}
			
			sb.append('\n');
			
		}
		
		br.close();
		
		System.out.println(sb);
		
	}
		
}
