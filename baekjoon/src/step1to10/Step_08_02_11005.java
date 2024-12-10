package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Step_08_02_11005 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String [] input=br.readLine().split(" ");
		int N=Integer.parseInt(input[0]);
		int B=Integer.parseInt(input[1]);
		br.close();
		
		Stack<Character> stack=new Stack<>();
		
		while(N!=0) {
			int temp=N%B;
			if(temp>=10) {
				char ch=(char)(N%B+55);
				stack.push(ch);
			}else {
				stack.push((char)(temp+'0'));
			}
			N/=B;
		}
		
		StringBuilder sb=new StringBuilder();
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		System.out.println(sb);

	}

}
