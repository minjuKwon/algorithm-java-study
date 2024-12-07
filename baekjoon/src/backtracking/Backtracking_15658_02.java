package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backtracking_15658_02 {

	static int [] arr;
	static int [] operator=new int[4];
	
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
		for(int i=0;i<4;i++) operator[i]=Integer.parseInt(st.nextToken());
		
		BT(1,arr[0]);
		
		System.out.println(max+"\n"+min);

	}
	
	static void BT(int depth, int sum) {
		
		if(depth==N) {
			max=Math.max(max, sum);
			min=Math.min(min, sum);
			return;
		}
		
		for(int i=0;i<4;i++) {
			if(operator[i]>0) {
				operator[i]--;
				if(i==0) {
					BT(depth+1,sum+arr[depth]);
				}else if(i==1) {
					BT(depth+1,sum-arr[depth]);
				}else if(i==2) {
					BT(depth+1,sum*arr[depth]);
				}else if(i==3) {
					BT(depth+1,sum/arr[depth]);
				}
				operator[i]++;				
			}
		}
		
	}

}
