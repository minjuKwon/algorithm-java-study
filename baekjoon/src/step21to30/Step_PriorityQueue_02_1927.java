package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Step_PriorityQueue_02_1927 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		PriorityQueue <Integer> queue=new PriorityQueue<>();
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
				queue.add(x);
			}
		}
		
		br.close();
		
		System.out.println(sb);

	}

}
