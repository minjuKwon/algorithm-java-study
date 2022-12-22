package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://st-lab.tistory.com/233
public class Step_10_04_2751_02 {

	private static int [] sorted;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int [] arr=new int[N];
		for(int i=0;i<arr.length;i++)
			arr[i]=Integer.parseInt(br.readLine());
		
		sorted=new int[arr.length];
		merge_sort(arr,0,arr.length-1);
		sorted=null;
		
		StringBuilder sb=new StringBuilder();
		for (int i : arr) {
			sb.append(i).append('\n');
		}
		
		System.out.println(sb);

	}
	
	private static void merge_sort(int[]a, int left, int right) {
		
		if(left==right)return;
		int mid=(left+right)/2;
		
		merge_sort(a,left,mid);
		merge_sort(a,mid+1,right);
		
		merge(a,left,mid,right);
		
	}
	
	private static void merge(int [] a, int left, int mid, int right) {
		int l=left;
		int r=mid+1;
		int idx=left;
		
		while(l<=mid&&r<=right) {
			if(a[l]<=a[r]) {
				sorted[idx]=a[l];
				idx++;
				l++;
			}
			else {
				sorted[idx]=a[r];
				idx++;
				r++;
			}
		}
		
		if(l>mid) {
			while(r<=right) {
				sorted[idx]=a[r];
				idx++;
				r++;
			}
		}else {
			while(l<=mid) {
				sorted[idx]=a[l];
				idx++;
				l++;
			}
		}
		
		for(int i=left;i<=right;i++)
			a[i]=sorted[i];
		
	}

}
