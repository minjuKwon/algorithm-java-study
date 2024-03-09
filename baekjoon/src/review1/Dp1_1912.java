package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dp1_1912 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int [] arr=new int[N];
		int [] result=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		br.close();
		
		int max=arr[0];
		result[0]=arr[0];
		
		for(int i=1;i<N;i++) {
			result[i] = Math.max(result[i-1]+arr[i], arr[i]);
			max=Math.max(result[i], max);
		}
		
		System.out.println(max);

	}

}
