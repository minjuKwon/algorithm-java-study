package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/267
public class Step_13_04_10816 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int [] arr=new int [N];
		StringTokenizer stN=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(stN.nextToken());
		}
		
		Arrays.sort(arr);
		
		int M=Integer.parseInt(br.readLine());
		StringTokenizer stM=new StringTokenizer(br.readLine());
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<M;i++) {
			int value=Integer.parseInt(stM.nextToken());
			sb.append(upperBound(arr,value)-lowerBound(arr,value)).append(' ');
		}
		
		System.out.println(sb);
	
	}
	
	private static int upperBound(int [] arr, int target) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]>target)
				high=mid-1;
			else 
				low=mid+1;
		}
		return low;
	}
	
	private static int lowerBound(int [] arr, int target) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]>=target)
				high=mid-1;
			else
				low=mid+1;
		}
		return low;
	}

}
