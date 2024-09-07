package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack2_17299 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int [] arr=new int[N];
		int [] F=new int[1_000_001];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			F[arr[i]]++;
		}
		br.close();
		
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<N;i++) {
			while(!stack.isEmpty()&&F[arr[i]]>F[stack.peek()]) {
				arr[stack.pop()]=arr[i];
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			arr[stack.pop()]=-1;
		}
		
		StringBuilder sb=new StringBuilder();
		for(int a:arr) {
			sb.append(a).append(' ');
		}
		
		System.out.println(sb);
		
	}

}
