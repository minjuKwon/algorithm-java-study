package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue_11286 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer>queue=new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				int a=Math.abs(o1);
				int b=Math.abs(o2);
				if(a==b) {
					return o1-o2;
				}
				return a-b;
			}
		});
		
		StringBuilder sb=new StringBuilder();

		while(N-->0) {
			int x=Integer.parseInt(br.readLine());
			if(x==0) {
				if(queue.isEmpty()) sb.append(0).append('\n');
				else sb.append(queue.poll()).append('\n');
			}else {
				queue.offer(x);
			}
		}
		br.close();
		
		System.out.println(sb);
		
	}

}