package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PreFixSum_2559 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		int [] arr=new int[N];
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		br.close();
		
		int len=N-K+1;
		int [] sum=new int[len];
		for(int i=0;i<K;i++) {
			sum[0]+=arr[i];
		}
		
		int start=0;
		int end=K;
		for(int i=1;i<len;i++) {
			sum[i]=sum[i-1]-arr[start++]+arr[end++];
		}
		
		int max=sum[0];
		for(int i=1;i<len;i++) {
			max=Math.max(max, sum[i]);
		}
		
		System.out.println(max);

	}

}
