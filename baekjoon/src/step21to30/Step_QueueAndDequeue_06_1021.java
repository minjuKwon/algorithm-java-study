package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Step_QueueAndDequeue_06_1021 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		LinkedList <Integer> dequeue=new LinkedList<>();
		for(int i=1;i<=N;i++) {
			dequeue.addLast(i);
		}

		int [] target=new int[M];
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			target[i]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		int count=0;
		
		for(int i=0;i<M;i++) {
			
			int index=0;
			
			for(int j=0;j<dequeue.size();j++) {
				if(target[i]==dequeue.get(j)) {
					index=j;
					break;
				}
			}
			
			if(index<=dequeue.size()/2) {
				for(int k=index;k>0;k--) {
					Integer element=dequeue.pollFirst();
					dequeue.addLast(element);
					count++;
				}
			}else {
				for(int k=index;k<dequeue.size();k++) {
					Integer element=dequeue.pollLast();
					dequeue.addFirst(element);
					count++;
				}
			}
			
			dequeue.pollFirst();
			
		}
		
		System.out.println(count);
		
	}

}
