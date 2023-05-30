package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_BinarySearch_04_2805 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int [] arr=new int[N];
		long max=0;
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		br.close();
		
		long mid=0;
		long min=0;
		
		while(min<=max) {
			
			long len=0;
			mid=(max+min)/2;
			
			for(int i=0;i<N;i++) {
				if(arr[i]>mid) {
					len+=(arr[i]-mid);
				}
			}
			
			if(len<M) {
				max=mid-1;
			}else {
				min=mid+1;
			}
			
		}
		
		System.out.println(min-1);

	}

}
