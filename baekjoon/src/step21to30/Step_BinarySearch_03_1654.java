package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/269
public class Step_BinarySearch_03_1654 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int K=Integer.parseInt(st.nextToken());
		int N=Integer.parseInt(st.nextToken());
		
		int [] arr=new int[K];
		
		long max=0;
		
		for(int i=0;i<K;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		br.close();

		long mid=0;
		long  min=1;

		while(min<=max) {
			
			long count=0;
			mid=(max+min)/2;
			
			for(int i=0;i<K;i++) {
				count+=arr[i]/mid;
			}
			
			if(count<N) {
				max=mid-1;
			}else {
				min=mid+1;
			}

		}
	
		System.out.println(min-1);
		
	}

}
