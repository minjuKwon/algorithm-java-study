package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/221
public class Step_QueueAndDequeue_07_5430 {
	
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		
		ArrayDeque<Integer> dequeue;
		StringTokenizer st;
		
		while(T-->0) {
			
			String func=br.readLine();
			
			int n=Integer.parseInt(br.readLine());
			
			dequeue=new ArrayDeque<Integer>();
			
			st=new StringTokenizer(br.readLine(),"[],");
			for(int i=0;i<n;i++) {
				dequeue.add(Integer.parseInt(st.nextToken()));
			}
			
			AC(func,dequeue);

		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static void AC(String fun, ArrayDeque<Integer>dequeue) {
		
		boolean reverse=false;
		
		for(char ch : fun.toCharArray()) {
			
			if(ch=='R') {
				reverse=!reverse;
				continue;
			}
			
			if(!reverse) {
				if(dequeue.pollFirst()==null) {
					sb.append("error").append('\n');
					return;
				}
			}else {
				if(dequeue.pollLast()==null) {
					sb.append("error").append('\n');
					return;
				}
			}
			
		}
		
		printArr(dequeue,reverse);
		
	}
	
	static void printArr(ArrayDeque<Integer> dequeue, boolean reverse) {
		
		sb.append('[');
		
		if(dequeue.size()>0) {
			if(!reverse) {
				sb.append(dequeue.pollFirst());
				while(!dequeue.isEmpty()) {
					sb.append(',').append(dequeue.pollFirst());
				}
			}else {
				sb.append(dequeue.pollLast());
				while(!dequeue.isEmpty()) {
					sb.append(',').append(dequeue.pollLast());
				}
			}
		}
		
		sb.append(']').append('\n');
		
	}

}
