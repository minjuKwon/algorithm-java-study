package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Backtracking_13913 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		br.close();
		
		int [] arrIdx=new int[100_001];
		int [] check=new int[100_001];
		
		StringBuilder sb=new StringBuilder();
		
		if(N==K) {
			sb.append(0).append('\n').append(N);
		}else {
			int result=bfs(arrIdx, check,N,K);
			sb.append(check[result]).append('\n');
			
			Stack<Integer> stack=new Stack<>();
			stack.push(K);
			int idx=K;
			for(int i=0;i<check[result];i++) {
				stack.push(arrIdx[idx]);
				idx=arrIdx[idx];
			}
			
			while(!stack.isEmpty()) {
				sb.append(stack.pop()).append(' ');
			}
		}
		
		System.out.println(sb);
		
	}
	
	static int bfs(int [] idx, int [] check, int startV, int target) {
		Queue<Integer> queue=new LinkedList<>();
		
		queue.offer(startV);
		check[startV]=1;
		
		while(!queue.isEmpty()) {
			int element=queue.poll();
			
			for(int i=0;i<3;i++) {
				int next=0;
				if(i==0) {
					next=element-1;
				}else if(i==1) {
					next=element+1;
				}else {
					next=element*2;
				}
				if(next==target) {
					idx[next]=element;
					return element;
				}
				if(next>=0&&next<=100000&&check[next]==0) {
					queue.offer(next);
					check[next]=check[element]+1;
					idx[next]=element;
				}
			}
			
		}
		return 0;
	}
	
}
