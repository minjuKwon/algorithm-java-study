package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_4949 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb=new StringBuilder();
		
		while(true) {
			String input=br.readLine();
			if(input.equals("."))
				break;
			sb.append(vps(input)).append('\n');		
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static String vps(String input) {
		Stack<Character> stack=new Stack<>();
		
		for(char ch:input.toCharArray()) {
			if(ch=='('||ch=='[') {
				stack.push(ch);
			}else if(ch==')') {
				if(stack.isEmpty()||stack.peek()!='(') {
					return "no";
				}else {
					stack.pop();	
				}
			}else if(ch==']') {
				if(stack.isEmpty()||stack.peek()!='[') {
					return "no";
				}else {
					stack.pop();		
				}
			}
		}
		
		if(stack.isEmpty()) {
			return "yes";
		}else {
			return "no";
		}
	
	}

}
