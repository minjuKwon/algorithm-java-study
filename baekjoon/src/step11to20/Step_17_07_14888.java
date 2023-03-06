package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_17_07_14888 {
	
	static int MAX=Integer.MIN_VALUE;
	static int MIN=Integer.MAX_VALUE;
	static int N;
	static int[] arr;
	static int[] operator=new int[4];

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		arr=new int[N];
		
		StringTokenizer stNum=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(stNum.nextToken());
		}
		
		StringTokenizer stOperator=new StringTokenizer(br.readLine());
		for(int i=0;i<4;i++) {
			operator[i]=Integer.parseInt(stOperator.nextToken());
		}
		
		br.close();
		
		dfs(arr[0],1);
		
		System.out.println(MAX);
		System.out.println(MIN);

	}
	
	public static void dfs(int num, int depth) {
		
		if(depth==N) {
			MAX=Math.max(MAX, num);
			MIN=Math.min(MIN, num);
			return;
		}
		
		for(int i=0;i<4;i++) {
			if(operator[i]>0) {
				operator[i]--;
				switch(i){
					case 0:dfs(num+arr[depth],depth+1);break;
					case 1:dfs(num-arr[depth],depth+1);break;
					case 2:dfs(num*arr[depth],depth+1);break;
					case 3:dfs(num/arr[depth],depth+1);break;
				}
				operator[i]++;
			}
		}
		
	}

}
