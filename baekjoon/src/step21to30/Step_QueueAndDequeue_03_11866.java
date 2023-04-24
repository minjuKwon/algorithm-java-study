package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Step_QueueAndDequeue_03_11866 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		br.close();
		
		Deque<Integer> queue=new LinkedList<>();
		
		for(int i=1;i<=N;i++) {
			queue.offer(i);
		}
		
		StringBuilder sb=new StringBuilder();
		sb.append("<");
		
		while(queue.size()>1) {
			for(int i=0;i<K-1;i++) {
				Integer element=queue.poll();
				queue.offer(element);
			}
			Integer target=queue.poll();
			sb.append(target).append(", ");
		}
		
		sb.append(queue.poll()).append(">");
		System.out.println(sb);

	}

}
