package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Recursion_24060 {
	
	static int K;
	static int result=-1;
	static int count=0;
	static int [] sorted;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		
		int [] arr=new int[N];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		sorted=new int[N];
		
		merge(arr, 0, N-1);
		
		System.out.println(result);

	}
	
	static void merge(int [] arr, int left, int right) {
		if(count>K )return;
		int mid=(left+right)/2;
		if(left<right) {
			merge(arr, left, mid);
			merge(arr, mid+1, right);
			merge_sort(arr, left, mid, right);			
		}
	}
	
	static void merge_sort(int [] arr, int left, int mid, int right) {
		int l=left;
		int r=mid+1;
		int idx=0;
		
		while(l<=mid&&r<=right) {
			if(arr[l]<=arr[r]) {
				sorted[idx]=arr[l];
				l++;
			}else {
				sorted[idx]=arr[r];
				r++;
			}
			idx++;
		}
		
		while(l<=mid)
			sorted[idx++]=arr[l++];
		while(r<=right)
			sorted[idx++]=arr[r++];
		
		l=left;
		idx=0;
		
		while(l<=right) {
			count++;
			if(count==K) {
				result= sorted[idx];				
			}
			arr[l++]=sorted[idx++];
		}
		
	}
	
}
