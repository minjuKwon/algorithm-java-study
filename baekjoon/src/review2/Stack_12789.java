package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack_12789 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int [] arr=new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		System.out.println(soluction(arr));

	}
	
	static String soluction(int [] arr) {
		
		Stack<Integer>stack=new Stack<>();
		int count=1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=count) {
				if(!stack.isEmpty()&&stack.peek()==count) {
					stack.pop();
					i--;
					count++;
				}else {
					stack.push(arr[i]);
				}
			}else {
				count++;
			}
		}
		
		int size=stack.size();
		for(int i=0;i<size;i++) {
			if(count==stack.peek()) {
				stack.pop();
				count++;
			}else {
				return "Sad";
			}
		}
		
		if(stack.isEmpty()) {
			return "Nice";
		}else {
			return "Sad";			
		}
		
	}

}
