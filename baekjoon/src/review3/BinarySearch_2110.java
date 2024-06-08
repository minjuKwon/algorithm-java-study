package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BinarySearch_2110 {
	
	static int [] arr;
	static int N;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken());
		int C=Integer.parseInt(st.nextToken());

		arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		br.close();
		
		Arrays.sort(arr);
		
		int low=1;
		int high=arr[N-1]-arr[0]+1;
		int mid=0;
		
		while(low<high) {
			mid=low+((high-low)/2);
			if(installation(mid)<C) {
				high=mid;
			}else {
				low=mid+1;
			}
		}
		
		System.out.println(low-1);
		
	}
	
	static int installation(int distance) {
		int count=1;
		int lastLocation=arr[0];
		for(int i=1;i<N;i++) {
			int location=arr[i];
			if(location-lastLocation>=distance) {
				count++;
				lastLocation=location;
			}
		}
		return count;
	}

}
