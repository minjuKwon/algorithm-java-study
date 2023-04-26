package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
//https://st-lab.tistory.com/211
public class Step_QueueAndDequeue_05_10866 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		ArrayDeque<Integer> dequeue=new ArrayDeque<>();
		
		StringBuilder sb=new StringBuilder();
		
		while(N-->0) {
			
			String [] input=br.readLine().split(" ");
		
			switch(input[0]) {
				case "push_front":
					dequeue.addFirst(Integer.parseInt(input[1]));
					break;
				case "push_back":
					dequeue.addLast(Integer.parseInt(input[1]));
					break;
				case "pop_front":
					if(dequeue.isEmpty())
						sb.append(-1).append('\n');
					else
						sb.append(dequeue.pollFirst()).append('\n');
					break;
				case "pop_back":
					if(dequeue.isEmpty())
						sb.append(-1).append('\n');
					else
						sb.append(dequeue.pollLast()).append('\n');
					break;
				case "size":
					sb.append(dequeue.size()).append('\n');
					break;
				case "empty":
					if(dequeue.isEmpty())
						sb.append(1).append('\n');
					else
						sb.append(0).append('\n');
					break;
				case "front":
					if(dequeue.isEmpty()) 
						sb.append(-1).append('\n');
					else
						sb.append(dequeue.peekFirst()).append('\n');
					break;
				case "back":
					if(dequeue.isEmpty())
						sb.append(-1).append('\n');
					else
						sb.append(dequeue.peekLast()).append('\n');
					break;
			}
			
		}
		
		br.close();
		
		System.out.println(sb);

	}

}
