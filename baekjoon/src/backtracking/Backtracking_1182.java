package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backtracking_1182 {

	static int [] arr;
	static int N,S,count;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		S=Integer.parseInt(st.nextToken());
		
		arr=new int[N];

		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) arr[i]=Integer.parseInt(st.nextToken());
		br.close();
		
		f(0,0);
		
		System.out.println(S==0?count-1:count);

	}
	
	static void f(int idx,int sum) {
		if(idx==N) {
			if(sum==S) {
				count++;
			}
			return;			
		}
		f(idx+1,sum);
		f(idx+1,sum+arr[idx]);
	}

}
