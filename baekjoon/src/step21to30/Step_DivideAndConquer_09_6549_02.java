package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/255
public class Step_DivideAndConquer_09_6549_02 {

	static int [] histogram;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n;
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		
		while(true) {
			
			st=new StringTokenizer(br.readLine());
			n=Integer.parseInt(st.nextToken());
			
			if(n==0) {
				break;
			}
			
			histogram=new int[n];
			
			for(int i=0;i<n;i++) {
				histogram[i]=Integer.parseInt(st.nextToken());
			}
			
			sb.append(getArea(n)).append('\n');
			
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static long getArea(int len) {
		
		Stack<Integer> stack=new Stack<Integer>();
		long maxArea=0;
		
		for(int i=0;i<len;i++) {
			
			while(!stack.isEmpty()&&histogram[stack.peek()]>=histogram[i]) {
				
				int height=histogram[stack.pop()];
				long width=stack.isEmpty() ? i : i-1-stack.peek();
				
				maxArea=Math.max(maxArea, width*height);
				
			}
			
			stack.push(i);
			
		}
		
		while(!stack.isEmpty()) {
			
			int height=histogram[stack.pop()];
			long width=stack.isEmpty() ? len : len-1-stack.peek();
		
			maxArea=Math.max(maxArea, width*height);
			
		}
		
		return maxArea;
		
	}

}
