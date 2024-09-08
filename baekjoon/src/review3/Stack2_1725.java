package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack2_1725 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		int N=Integer.parseInt(br.readLine());
		int [] arr=new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		Stack<Integer>stack=new Stack<>();
		int max=0;
		
		for(int i=0;i<N;i++) {
			while(!stack.isEmpty()&&arr[stack.peek()]>=arr[i]) {
				int height=arr[stack.pop()];
				int width=stack.isEmpty()?i:i-1-stack.peek();
				max=Math.max(max, height*width);
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			int height=arr[stack.pop()];
			int width=stack.isEmpty()?N:N-1-stack.peek();
			max=Math.max(max, height*width);
		}
		
		System.out.println(max);
		
	}

}
