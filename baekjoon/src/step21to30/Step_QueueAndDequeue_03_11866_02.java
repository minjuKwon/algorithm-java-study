package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Step_QueueAndDequeue_03_11866_02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		br.close();
		
		LinkedList<Integer> list=new LinkedList<>();
		
		for(int i=0;i<N;i++) {
			list.add(i+1);
		}
		
		int idx=0;
		
		StringBuilder sb=new StringBuilder();
		sb.append("<");
		
		while(list.size()>1) {
			idx=(idx+(K-1))%N;
			int element=list.remove(idx);
			sb.append(element).append(", ");
			N--;
		}
		
		sb.append(list.remove()).append(">");
		System.out.println(sb);

	}

}
