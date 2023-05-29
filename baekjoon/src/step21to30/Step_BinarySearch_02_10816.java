package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/267
public class Step_BinarySearch_02_10816 {
	
	static int [] arr;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		arr=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);

		int M=Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<M;i++) {
			int target=Integer.parseInt(st.nextToken());
			int result=uppderBound(target)-lowerBound(target);
			sb.append(result).append(' ');
		}

		br.close();
		
		System.out.println(sb);

	}
	
	static int uppderBound(int target) {
		
		int low=0;
		int high=arr.length;
		
		while(low<high) {			
			int mid=(low+high)/2;			
			if(target<arr[mid]) {
				high=mid;
			}else {
				low=mid+1;
			}			
		}
		
		return low;
		
	}
	
	static int lowerBound(int target) {
		
		int low=0;
		int high=arr.length;
		
		while(low<high) {
			int mid=(low+high)/2;
			if(target<=arr[mid]) {
				high=mid;
			}else {
				low=mid+1;
			}
		}
		
		return low;
		
	}
	
}
