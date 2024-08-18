package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue_11279 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer>queue=new PriorityQueue<>(Collections.reverseOrder());
		StringBuilder sb=new StringBuilder();
		
		while(N-->0) {
			int x=Integer.parseInt(br.readLine());
			if(x==0) {
				if(queue.isEmpty()) {
					sb.append(0).append('\n');
				}else {
					sb.append(queue.poll()).append('\n');
				}
			}else {
				queue.offer(x);
			}
		}
		br.close();
		
		System.out.println(sb);

	}

}
