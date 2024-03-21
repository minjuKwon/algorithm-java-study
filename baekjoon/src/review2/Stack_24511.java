package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Stack_24511 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int [] type=new int[N];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			type[i]=Integer.parseInt(st.nextToken());
		}
		
		Deque<Integer> deque=new ArrayDeque<>();
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			if(type[i]==0) {
				deque.addLast(Integer.parseInt(st.nextToken()));
			}else {
				st.nextToken();
			}
		}
		
		int M=Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<M;i++) {
			deque.addFirst(Integer.parseInt(st.nextToken()));
			sb.append(deque.removeLast()).append(' ');
		}
		
		System.out.println(sb);
		
	}

}
