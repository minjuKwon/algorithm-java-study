package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_10_04_2751_05 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int [] arr=new int[N];
		for(int i=0;i<arr.length;i++)
			arr[i]=Integer.parseInt(br.readLine());
		
		heap_sort(arr,arr.length);
		
		StringBuilder sb=new StringBuilder();
		for(int num : arr)
			sb.append(num).append('\n');
		
		System.out.println(sb);

	}
	
	private static void heap_sort(int [] a, int size) {
		
		if(size<2)
			return;
		
		int parentIdx=getParent(size-1);
		
		for(int i=parentIdx;i>=0;i--)
			heapify(a,i,size-1);
		
		for(int i=size-1;i>0;i--) {
			swap(a,0,i);
			heapify(a,0,i-1);
		}
	}
	
	private static int getParent(int child) {
		return (child-1)/2;
	}
	
	private static void swap(int [] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	private static void heapify(int [] a, int parentIdx, int lastIdx) {
		
		int leftChildIdx;
		int rightChildIdx;
		int largestIdx;
		
		while((parentIdx*2)+1<=lastIdx) {
			leftChildIdx=(parentIdx*2)+1;
			rightChildIdx=(parentIdx*2)+2;
			largestIdx=parentIdx;
			
			if(a[leftChildIdx]>a[largestIdx])
				largestIdx=leftChildIdx;
			
			if(rightChildIdx<=lastIdx&&a[rightChildIdx]>a[largestIdx])
				largestIdx=rightChildIdx;
			
			if(largestIdx!=parentIdx) {
				swap(a,parentIdx,largestIdx);
				parentIdx=largestIdx;
			}else {
				return;
			}
		}
		
	}

}
