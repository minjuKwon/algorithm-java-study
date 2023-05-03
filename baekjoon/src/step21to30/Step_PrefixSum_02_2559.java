package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_PrefixSum_02_2559 {

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
		
		int max=Integer.MIN_VALUE;
		int range=N-K+1;
		
		for(int i=0;i<range;i++) {
			int sum=0;
			for(int j=i;j<i+K;j++) {
				sum+=arr[j];
			}
			if(sum>max) {
				max=sum;
			}
		}
		
		System.out.println(max);

	}

}
