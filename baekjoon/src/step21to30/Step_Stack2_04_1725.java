package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
//https://st-lab.tistory.com/255
public class Step_Stack2_04_1725 {
	
	static int [] histogram;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		histogram=new int[N];
		for(int i=0;i<N;i++) {
			histogram[i]=Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		System.out.println(getArea(N));

	}
	
	static int getArea(int len) {
		
		Stack<Integer>stack=new Stack<>();
		
		int max=0;
		
		for(int i=0;i<len;i++) {
			while(!stack.isEmpty()&&histogram[stack.peek()]>=histogram[i]) {
				int height=histogram[stack.pop()];
				int width=stack.isEmpty()?i:i-1-stack.peek();
				max=Math.max(max, height*width);
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			int height=histogram[stack.pop()];
			int width=stack.isEmpty()?len:len-1-stack.peek();
			max=Math.max(max, height*width);
		}
		
		return max;
		
	}

}
