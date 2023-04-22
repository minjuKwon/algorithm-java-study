package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_QueueAndDequeue_01_18258 {
	
	static int [] queue;
	static int head=0;
	static int tail=0;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		queue=new int[N];
		
		String input;
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		
		while(N-->0) {
			
			st=new StringTokenizer(br.readLine());
			input=st.nextToken();
			
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
				case "front":
					sb.append(front()).append('\n');
					break;
				case "back":
					sb.append(back()).append('\n');
					break;
			}
		
		}
		
		br.close();
		
		System.out.println(sb);
		
	}
	
	static void push(int x) {
		queue[tail]=x;
		tail++;
	}
	
	static int pop() {
		if(queue[head]==0)
			return -1;
		else {
			int num=queue[head];
			queue[head]=0;
			head++;
			return num;
		}
	}
	
	static int size() {
		return tail-head;
	}
	
	static int empty() {
		if(head==tail)
			return 1;
		else 
			return 0;
	}
	
	static int front() {
		if(queue[head]==0)
			return -1;
		else
			return queue[head];
	}
	
	static int back() {
		if(queue[head]==0)
			return -1;
		else
			return queue[tail-1];
	}

}
