package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Step_Backtracking_02_14002 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int [] arr=new int[N+1];
		int [] dp=new int[N+1];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		dp[1]=1;
		int result=dp[1];
		
		for(int i=2;i<=N;i++) {
			dp[i]=1;
			for(int j=1;j<i;j++) {
				if(arr[i]>arr[j]) {
					dp[i]=Math.max(dp[i], dp[j]+1);
				}
			}
			result=Math.max(result, dp[i]);
		}
		
		int value=result;
		Stack<Integer> stack=new Stack<>();
		
		for(int i=N;i>=1;i--) {
			if(dp[i]==value) {
				stack.push(arr[i]);
				value--;
			}
		}
		
		StringBuilder sb=new StringBuilder();
		
		sb.append(result).append('\n');
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop()).append(' ');
		}
		
		System.out.println(sb);

	}

}
