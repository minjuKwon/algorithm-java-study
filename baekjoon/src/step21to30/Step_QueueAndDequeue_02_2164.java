package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Step_QueueAndDequeue_02_2164 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		br.close();
		
		Deque<Integer> queue=new LinkedList<>();
		
		for(int i=1;i<=N;i++) {
			queue.offer(i);
		}
		
		while(N-->1) {
			queue.pop();
			Integer item=queue.poll();
			queue.offer(item);
		}
		
		System.out.println(queue.peek());

	}

}
