package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_DivideAndConquer_09_6549_03 {
	
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
		
		int [] stack=new int[len];
		int top=-1;
		int size=0;
		long maxArea=0;
		
		for(int i=0;i<len;i++) {
			
			while(size>0&&histogram[stack[top]]>=histogram[i]) {
				int height=histogram[stack[top--]];
				size--;
				long width=size==0 ? i : i-1-stack[top];
				maxArea=Math.max(maxArea, width*height);	
			}
			
			stack[++top]=i;
			size++;
			
		}
		
		while(size>0) {
			int height=histogram[stack[top--]];
			size--;
			long width=size==0? len : len-1-stack[top];
			maxArea=Math.max(maxArea, width*height);
		}
		
		return maxArea;
		
	}
	
}
