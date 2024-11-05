package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backtracking_16922 {

	static int [] arr= {1,5,10,50};
	static boolean [] check;
	static int N,count;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		br.close();
		
		check=new boolean[1001];
		
		dp(0,0,0);
		
		System.out.println(count);
		
	}
	
	static void dp(int depth,int idx,int sum) {
		if(depth==N) {
			if(!check[sum]) {
				check[sum]=true;
				count++;
			}
			return;
		}
		
		for(int i=idx;i<4;i++) {
			dp(depth+1,i, sum+arr[i]);		
		}
	}

}
