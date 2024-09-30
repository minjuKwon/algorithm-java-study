package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TwoPointers_2470 {

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
		
		int start=0; int end=N-1;
		int sum=0; int result=Integer.MAX_VALUE;
		int idx1=0; int idx2=0;
		
		while(start<end) {
			 sum=arr[start]+arr[end];
			 int temp=Math.abs(sum);
			 if(result>temp) {
				 result=temp;
				 idx1=start;
				 idx2=end;
			 }
			 if(sum>0) end--;
			 else start++;
		}
		
		System.out.println(arr[idx1]+" "+arr[idx2]);

	}

}
