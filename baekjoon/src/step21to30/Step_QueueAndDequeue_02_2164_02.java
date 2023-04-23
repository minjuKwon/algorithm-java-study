package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_QueueAndDequeue_02_2164_02 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		br.close();
		
		int [] queue=new int[N*2];
		
		for(int i=1;i<=N;i++) {
			queue[i]=i;
		}
		
		int head=1;
		int tail=N+1;
		
		while(N-->1) {
			head++;
			queue[tail]=queue[head];
			head++;
			tail++;
		}
		
		System.out.println(queue[head]);
	
	}
	
}
