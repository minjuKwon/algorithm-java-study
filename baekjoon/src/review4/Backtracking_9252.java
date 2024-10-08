package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Backtracking_9252 {
	
	static int [][] dp;
	static char [] s1;
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		s1=br.readLine().toCharArray();
		char [] s2=br.readLine().toCharArray();
		br.close();
		
		int len1=s1.length;
		int len2=s2.length;
		dp=new int[len1+1][len2+1];
		
		for(int i=1;i<=len1;i++) {
			for(int j=1;j<=len2;j++) {
				if(s1[i-1]==s2[j-1]) {
					dp[i][j]=dp[i-1][j-1]+1;
				}else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		sb.append(dp[len1][len2]).append('\n');
		
		getString(len1,len2);
		
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
				stack.add(s1[x-1]);
				x--;
				y--;
			}
		}
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
	}

}
