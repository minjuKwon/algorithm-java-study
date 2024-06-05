package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinarySearch_1654 {
	
	static int [] arr;
	static int K, max;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		K=Integer.parseInt(st.nextToken());
		int N=Integer.parseInt(st.nextToken());
		
		arr=new int[K];
		max=0;
		
		for(int i=0;i<K;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]>max) max=arr[i];
		}
		br.close();
		
		System.out.println(search(N)-1);
		
	}
	
	static long search(int target) {
		long low=1;
		long high=max;
		long mid=0;
		
		while(low<=high) {
			mid=low+((high-low)/2);
			long sum=0;
			for(int i=0;i<K;i++) {
				sum+= (arr[i]/mid);
			}
			if(target>sum) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		
		return low;
	}

}
