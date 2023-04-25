package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/201
public class Step_QueueAndDequeue_04_1966 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int T=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();

		while(T-->0) {
			
			StringTokenizer stT=new StringTokenizer(br.readLine());
			
			int N=Integer.parseInt(stT.nextToken());
			int M=Integer.parseInt(stT.nextToken());
			
			LinkedList<int[]> queue=new LinkedList<>();
		
			StringTokenizer	stPriority=new StringTokenizer(br.readLine());
			
			for(int i=0;i<N;i++) {
				queue.offer(new int[] {i,Integer.parseInt(stPriority.nextToken())});
			}
			
			int order=0;
			
			while(!queue.isEmpty()) {
				
				int [] front=queue.poll();
				boolean isMax=true;
				
				for(int i=0;i<queue.size();i++) {
					
					if(front[1]<queue.get(i)[1]) {
						queue.offer(front);
						for(int j=0;j<i;j++) {
							queue.offer(queue.poll());
						}
						isMax=false;
						break;
					}
					
				}
				
				if(isMax==false) {
					continue;
				}
				
				order++;
				
				if(front[0]==M) {
					break;
				}
				
			}
			
			sb.append(order).append('\n');
			
		}
		
		br.close();
		
		System.out.println(sb);

	}
	


}
