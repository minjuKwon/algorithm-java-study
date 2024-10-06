package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Backtracking_14002 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int [] arr=new int[N];
		int [] dp=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		br.close();
		
		int result=dp[0]=1;
		for(int i=1;i<N;i++) {
			dp[i]=1;
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]&&dp[i]<dp[j]+1) {
					dp[i]=dp[j]+1;
				}
			}
			result=Math.max(result, dp[i]);
		}
		
		StringBuilder sb=new StringBuilder();
		sb.append(result).append('\n');
		
		Stack<Integer> stack=new Stack<>();
		for(int i=N-1;i>=0;i--) {
			if(dp[i]==result) {
				stack.add(arr[i]);
				result--;
			}	
		}
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop()).append(' ');
		}
		
		System.out.println(sb);

	}

}
