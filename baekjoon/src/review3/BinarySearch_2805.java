package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinarySearch_2805 {

	static int [] arr;
	static int N;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		arr=new int[N];
		int max=0;
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			if(arr[i]>max) max=arr[i];
		}
		br.close();
		
		System.out.println(search(M,max));

	}
	
	static int search(int target, int max) {
		int min=0;
		int mid=0;
		
		while(min<=max) {
			mid=min+((max-min)/2);
			long sum=0;
			for(int i=0;i<N;i++) {
				if(arr[i]>mid) {
					sum +=(arr[i]-mid);					
				}
			}
			if(sum<target) {
				max=mid-1;
			}else {
				min=mid+1;
			}
		}
		
		return min-1;
	}

}
