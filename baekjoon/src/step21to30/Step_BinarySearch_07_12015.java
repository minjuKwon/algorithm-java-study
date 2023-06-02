package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/285
public class Step_BinarySearch_07_12015 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int [] sequence=new int[N];
		int [] LIS=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			sequence[i]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		LIS[0]=sequence[0];
		
		int len=1;
		
		for(int i=1;i<N;i++) {
			
			int key=sequence[i];
			
			if(LIS[len-1]<key) {
				len++;
				LIS[len-1]=key;
			}else {
				
				int low=0;
				int high=len;
				
				while(low<high) {
					int mid=(low+high)>>>1;
					if(LIS[mid]<key) {
						low=mid+1;
					}else {
						high=mid;
					}
				}
				
				LIS[low]=key;
				
			}
			
		}
		
		System.out.println(len);
		
	}

}
