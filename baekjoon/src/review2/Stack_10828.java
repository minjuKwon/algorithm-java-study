package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack_10828 {
	
	static int [] stack;
	static int size=0;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		stack=new int[N];
		
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		
		while(N-->0) {
			st=new StringTokenizer(br.readLine());
			String input=st.nextToken();
			switch(input) {
				case "push":
					push(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					sb.append(pop()).append('\n');
					break;
				case "size":
					sb.append(size()).append('\n');
					break;
				case "empty":
					sb.append(empty()).append('\n');
					break;
				case "top":
					sb.append(top()).append('\n');
					break;
			}
		}
		
		System.out.println(sb);

	}
	
	static void push(int num) {
		stack[size]=num;
		size++;
	}
	
	static int pop() {
		if(size==0)
			return -1;
		else {
			int num=stack[size-1];
			stack[--size]=0;
			return num;			
		}
	}
	
	static int size() {
		return size;
	}
	
	static int empty() {
		if(size==0)
			return 1;
		else
			return 0;
	}
	
	static int top() {
		if(size==0)
			return -1;
		else
			return stack[size-1];
	}

}
