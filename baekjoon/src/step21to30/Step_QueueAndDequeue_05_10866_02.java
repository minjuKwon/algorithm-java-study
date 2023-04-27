package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://st-lab.tistory.com/211
public class Step_QueueAndDequeue_05_10866_02 {
	
	static int [] dequeue=new int[10000];
	static int head=0;
	static int tail=0;
	static int size=0;
	
	public static void main(String[] args)  throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		
		while(N-->0) {
			
			String [] str=br.readLine().split(" ");
			String input=str[0];
		
			switch(input) {
				case "push_front":
					push_front(Integer.parseInt(str[1]));
					break;
				case "push_back":
					push_back(Integer.parseInt(str[1]));
					break;
				case "pop_front":
					sb.append(pop_front()).append('\n');
					break;
				case "pop_back":
					sb.append(pop_back()).append('\n');
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
	
	static void push_front(int x) {
		dequeue[head]=x;
		head=(head-1+10000)%10000;
		size++;
	}
	
	static void push_back(int x) {
		tail=(tail+1)%10000;
		dequeue[tail]=x;
		size++;
	}
	
	static int pop_front() {
		if(size==0) {
			return -1;			
		}
		else {
			int element=dequeue[(head+1)%10000];
			head=(head+1)%10000;
			size--;
			return element;
		}
	}
	
	static int pop_back() {
		if(size==0)
			return -1;
		else {
			int element=dequeue[tail];
			tail=(tail-1+10000)%10000;
			size--;
			return element;
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
	
	static int front() {
		if(size==0)
			return -1;
		else {
			return dequeue[(head+1)%10000];
		}
	}
	
	static int back() {
		if(size==0)
			return -1;
		else {
			return dequeue[tail];
		}
	}

}
