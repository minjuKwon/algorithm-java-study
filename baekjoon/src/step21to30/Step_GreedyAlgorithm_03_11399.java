package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Step_GreedyAlgorithm_03_11399 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int [] arr=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		Arrays.sort(arr);
		
		int totalSum=arr[0];
		int preSum=arr[0];
		
		for(int i=1;i<N;i++) {
			preSum+=arr[i];
			totalSum+=preSum;
		}
		
		System.out.println(totalSum);

	}

}
