package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicProgramming_15312 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String A=br.readLine();
		String B=br.readLine();
		
		br.close();
		
		int len=A.length()*2;
		int [] alphabet= {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		int [] dp=new int[len];
		
		for(int i=0,j=0;i<len;i+=2,j++) {
			dp[i]=alphabet[A.charAt(j)-'A'];
			dp[i+1]=alphabet[B.charAt(j)-'A'];
		}
		 
		while(len-->2) {
			for(int i=0;i<len;i++) {
				dp[i]=(dp[i]+dp[i+1])%10;
			}		
		}
		
		System.out.println(dp[0]+""+dp[1]);

	}

}
