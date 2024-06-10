package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinarySearch_12015 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int [] arr=new int[N];
		int [] sequence=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		sequence[0]=arr[0];
		int len=1;
		
		for(int i=1;i<N;i++) {
			int temp=arr[i];
			if(sequence[len-1]<temp) {
				len++;
				sequence[len-1]=temp;
			}
			else {
				int low=0;
				int high=len;
				while(low<=high) {
					int mid=low+((high-low)>>>1);
					if(sequence[mid]<temp) {
						low=mid+1;
					}else {
						high=mid-1;
					}
				}
				sequence[low]=temp;
			}
		}
		
		System.out.println(len);
		
	}
	

}
