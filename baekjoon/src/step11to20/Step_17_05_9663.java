package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://st-lab.tistory.com/118
public class Step_17_05_9663 {
	
	static int[] arr;
	static int count=0;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		br.close();
		
		arr=new int[N];
		
		dfs(N,0);
		
		System.out.println(count);
		
	}
	
	static void dfs(int N, int depth) {
		if(depth==N) {
			count++;
			return;
		}
		for(int i=0;i<N;i++) {
			arr[depth]=i;
			if(forward(depth)) {
				dfs(N,depth+1);
			}
		}
	}
	
	static boolean forward(int column) {
		for(int i=0;i<column;i++) {
			if(arr[i]==arr[column]) {
				return false;
			}else if(Math.abs(i-column)==Math.abs(arr[i]-arr[column])) {
				return false;
			}
		}
		return true;
	}

}
