package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DynamicProgramming_19947 {

	static int [] dp;
	static int Y;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int H=Integer.parseInt(st.nextToken());
		Y=Integer.parseInt(st.nextToken());
		
		br.close();

		dp=new int[Y+1];
		dp[0]=H;
		
		int result=investment(Y);
		
		System.out.println(result);

	}
	
	static int investment(int  y) {
		if(dp[y]==0) {
			if(y>=5) {
				dp[y]=(int)Math.max(investment(y-5)*1.35, Math.max(investment(y-3)*1.2, investment(y-1)*1.05));
			}			
			else if(y>=3) {
				dp[y]=(int)Math.max(investment(y-3)*1.2, investment(y-1)*1.05);
			}else {
				dp[y]=(int)(investment(y-1)*1.05);
			}
		}
		return dp[y];
	}

}
