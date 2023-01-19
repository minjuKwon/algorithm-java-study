package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_11_04_24060 {
	
	private static int [] sorted;
	private static int K;
	private static int count;
	private static int result=-1;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		K=Integer.parseInt(st.nextToken());
		
		int [] arr=new int[N];
		StringTokenizer stArr=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
			arr[i]=Integer.parseInt(stArr.nextToken());
		
		sorted=new int[N];
		merge_sort(arr,0,arr.length-1);
		sorted=null;
		
		System.out.println(result);
		
	}
	
	private static void merge_sort(int []a, int left, int right) {
		
		if(count>K) return;
		
		if(left<right) {
			int mid=(left+right)/2;
			merge_sort(a,left,mid);
			merge_sort(a,mid+1,right);
			merge(a,left,mid,right);
		}
		
	}
	
	private static void merge(int []a, int left, int mid, int right) {
		int l=left;
		int r=mid+1;
		int idx=0;
		
		while(l<=mid&&r<=right) {
			if(a[l]<=a[r]) {
				sorted[idx]=a[l];
				l++;
			}else {
				sorted[idx]=a[r];
				r++;
			}
			idx++;
		}
		
		while(l<=mid)
			sorted[idx++]=a[l++];
		while(r<=right)
			sorted[idx++]=a[r++];
		
		l=left;
		idx=0;
		
		while(l<=right) {
			count++;
			if(count==K) {
				result=sorted[idx];
				break;
			}
			a[l++]=sorted[idx++];
		}
		
	}

}
