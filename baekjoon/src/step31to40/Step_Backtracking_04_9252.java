package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Step_Backtracking_04_9252 {
	
	static int [][] dp;
	static char [] arr1,arr2;
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		arr1=br.readLine().toCharArray();
		arr2=br.readLine().toCharArray();
		
		br.close();
		
		int arr1Len=arr1.length;
		int arr2Len=arr2.length;
		
		dp=new int [arr1Len+1][arr2Len+1];
		
		for(int i=1;i<=arr1Len;i++) {
			for(int j=1;j<=arr2Len;j++) {
				if(arr1[i-1]==arr2[j-1]) {
					dp[i][j]=dp[i-1][j-1]+1;
				}else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		sb.append(dp[arr1Len][arr2Len]).append('\n');
		
		getString(arr1Len, arr2Len);
		
		System.out.println(sb);

	}
	
	static void getString(int x, int y) {
		
		Stack<Character> stack=new Stack<>();
		
		while(x>0&&y>0) {
			 if(dp[x][y]==dp[x-1][y]) {
				x--;
			}else if(dp[x][y]==dp[x][y-1]) {
				y--;
			}else {
				stack.push(arr1[x-1]);
				x--; y--;
			}
		}
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
	}

}
