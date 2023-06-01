package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://st-lab.tistory.com/281
public class Step_BinarySearch_06_1300 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int K=Integer.parseInt(br.readLine());
		
		br.close();
		
		long low=1;
		long high=K;
		
		while(low<high) {
			
			long count=0;
			long mid=(high+low)/2;
			
			for(int i=1;i<=N;i++) {
				count+=Math.min(mid/i, N);
			}
			
			if(K<=count) {
				high=mid;
			}else {
				low=mid+1;
			}
			
		}
		
		System.out.println(low);

	}

}
