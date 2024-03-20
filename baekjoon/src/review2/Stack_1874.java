package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_1874 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int [] arr=new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		StringBuilder sb=new StringBuilder();
		Stack<Integer> stack=new Stack<>();
		
		int num=0;
		
		for(int i=0;i<N;i++) {
			int input=arr[i];
			if(stack.isEmpty()||stack.peek()!=input) {
				if(input<num) {
					System.out.println("NO");
					System.exit(0);
				}
				num++;
				stack.push(num);
				i--;
				sb.append('+').append('\n');
			}else if(!stack.isEmpty()&&stack.peek()==input) {
				stack.pop();
				sb.append('-').append('\n');
			}
		}
		
		System.out.println(sb);

	}

}
