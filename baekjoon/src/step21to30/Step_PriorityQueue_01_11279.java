package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_PriorityQueue_01_11279 {
	
	static int [] heap=new int[100001];
	static int size=0;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		
		while(N-->0) {
			int x=Integer.parseInt(br.readLine());
			if(x==0) {
				if(size==0) {
					sb.append(0).append('\n');
				}else {
					sb.append(pop(x)).append('\n');					
				}
			}else {
				push(x);
			}
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static void swap(int a, int b) {
		int temp=heap[a];
		heap[a]=heap[b];
		heap[b]=temp;
	}
	
	static void push(int num) {
		heap[++size]=num;
		int p=size;
		while(p>1&&heap[p]>heap[p/2]) {
			swap(p,p/2);
			p/=2;
		}
	}
	
	static int pop(int a) {
		
		int result=heap[1];

		heap[1]=heap[size];
		heap[size--]=0;
		
		for(int i=1;i*2<=size;) {
			if(heap[i]>heap[i*2]&&heap[i]>heap[i*2+1]) {
				break;
			}else if(heap[i*2]>heap[i*2+1]) {
				swap(i,i*2);
				i=i*2;
			}else{
				swap(i,i*2+1);
				i=i*2+1;
			}
		}
		
		return result;
		
	}

}
