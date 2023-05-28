package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Step_BinarySearch_01_1920 {
	
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
			int result=search(0,N-1,Integer.parseInt(st.nextToken()));
			sb.append(result).append('\n');
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static int search(int low, int high, int target) {
		
		while(low<=high) {
			
			int mid=(high+low)/2;
			
			if(arr[mid]==target) {
				return 1;
			}else if(target<arr[mid]) {
				return search(low,mid-1,target);
			}else {
				return search(mid+1,high,target);
			}
			
		}
		
		return 0;
		
	}

}
