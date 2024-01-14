package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backtracking_9663 {
	
	static int [] arr;
	static int N;
	static int count=0;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		br.close();
		
		arr=new int[N];

		dfs(0);
		
		System.out.println(count);
		
	}
	
	static void dfs(int depth) {
		
		if(depth==N) {
			count++;
			return;
		}
		
		for(int i=0;i<N;i++) {
			arr[depth]=i;
			if(movement(depth)) {
				dfs(depth+1);				
			}
		}
		
	}
	
	static boolean movement(int index) {
		for(int i=0;i<index;i++) {
			if(arr[i]==arr[index]) {
				return false;
			}else if(Math.abs(i-index)==Math.abs(arr[i]-arr[index])) {
				return false;
			}
		}
		return true;
	}

}
