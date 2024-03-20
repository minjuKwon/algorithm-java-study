package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Stack_2346 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int [] arr=new int[N+1];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		br.close();
		
		Deque<Integer> deque=new ArrayDeque<>();
		for(int i=1;i<=N;i++) {
			deque.add(i);
		}
		
		StringBuilder sb=new StringBuilder();
		
		int index=1;
		sb.append(1).append(' ');
		deque.removeFirst();
		
		while(!deque.isEmpty()) {
			int temp=arr[index];
			if(temp>0) {
				for(int i=1;i<temp;i++) {
					deque.addLast(deque.removeFirst());
				}
			}else {
				for(int i=temp;i<0;i++) {
					deque.addFirst(deque.removeLast());
				}
			}
			index=deque.removeFirst();
			sb.append(index).append(' ');
		}
		
		System.out.println(sb);
		
	}

}
