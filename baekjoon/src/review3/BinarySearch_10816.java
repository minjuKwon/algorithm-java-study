package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BinarySearch_10816 {
	
	static int [] arr;
	static int N;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		
		arr=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int M=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			int m=Integer.parseInt(st.nextToken());
			sb.append(upperBound(m)-lowerBound(m)).append(' ');
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static int upperBound(int value) {
		int low=0;
		int high=N-1;
		int mid=0;
		
		while(low<=high) {
			mid=low+((high-low)/2);
			if(arr[mid]<=value) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		
		return low;
	}
	
	static int lowerBound(int value) {
		int low=0;
		int high=N-1;
		int mid=0;
		
		while(low<=high) {
			mid=low+((high-low)/2);
			if(arr[mid]<value) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		
		return low;
	}

}
