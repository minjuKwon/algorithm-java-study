package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backtracking_15658 {
	
	static int [] arr;
	static int N;
	static int max=Integer.MIN_VALUE;
	static int min=Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		arr=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) arr[i]=Integer.parseInt(st.nextToken());
		
		st=new StringTokenizer(br.readLine());
		
		int plus=Integer.parseInt(st.nextToken());
		int minus=Integer.parseInt(st.nextToken());
		int mul=Integer.parseInt(st.nextToken());
		int div=Integer.parseInt(st.nextToken());
		
		br.close();
		
		BT(1,arr[0],plus,minus,mul,div);
		
		System.out.println(max+"\n"+min);

	}
	
	static void BT(int depth, int sum, int plus, int minus, int mul, int div) {
		
		if(depth==N) {
			max=Math.max(max, sum);
			min=Math.min(min, sum);
			return;
		}
		
		for(int i=0;i<4;i++) {
			if(i==0&&plus>0) {
				BT(depth+1, sum+arr[depth], plus-1, minus, mul, div);
			}else if(i==1&&minus>0) {
				BT(depth+1, sum-arr[depth], plus, minus-1, mul, div);
			}else if(i==2&&mul>0) {
				BT(depth+1, sum*arr[depth], plus, minus, mul-1, div);
			}else if(i==3&&div>0){
				BT(depth+1, sum/arr[depth], plus, minus, mul, div-1);
			}
		}
		
	}

}
