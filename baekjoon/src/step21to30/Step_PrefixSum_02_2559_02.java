package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_PrefixSum_02_2559_02 {

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
		
		int max=0;		
		for(int i=0;i<K;i++) {
			max+=arr[i];
		}

		int range=N-K;
		int sum=max;
		
		for(int i=1;i<=range;i++) {
			sum=sum-arr[i-1]+arr[i+K-1];
			if(sum>max) {
				max=sum;
			}
		}
		
		System.out.println(max);

	}

}
