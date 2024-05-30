package review3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BinarySearch_1920 {
	
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
		
		StringBuilder sb=new StringBuilder();
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			int answer=search(0,N-1,Integer.parseInt(st.nextToken()));
			sb.append(answer).append('\n');
		}
	
		System.out.println(sb);
	
	}
	
	static int search(int low, int high, int value) {
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==value) {
				return 1;
			}else if(arr[mid]<value) {
				return search(mid+1, high, value);
			}else {
				return search(low, mid-1, value);
			}
		}
		return 0;	
	}

}
