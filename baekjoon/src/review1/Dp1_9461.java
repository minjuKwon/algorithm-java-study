package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dp1_9461 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		long[] arr=new long[101];
		arr[1]=arr[2]=arr[3]=1;
		
		StringBuilder sb=new StringBuilder();
		while(T-->0) {
			int N=Integer.parseInt(br.readLine());
			for(int i=3;i<=N;i++) {
				arr[i]=arr[i-2]+arr[i-3];
			}
			sb.append(arr[N]).append("\n");
		}
		
		br.close();

		System.out.println(sb);

	}

}
