package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch_1300 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int K=Integer.parseInt(br.readLine());
		br.close();
		
		int low=1;
		int high=K;
		int mid=0;
		
		while(low<=high) {
			mid=low+((high-low)/2);
			long count=0;
			for(int i=1;i<=N;i++) {
				count+=Math.min(mid/i, N);
			}
			if(count<K) {
				low=mid+1;	
			}else {
				high=mid-1;
			}
		}
		
		System.out.println(low);

	}

}
