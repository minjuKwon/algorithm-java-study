package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Backtracking_14003 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int [] arr=new int[N];
		int [] sequence=new int[N];
		int [] arrIdx=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		br.close();
		
		sequence[0]=arr[0];
		int len=1;
		
		for(int i=1;i<N;i++) {
			int key=arr[i];
			if(sequence[len-1]<key) {
				len++;
				sequence[len-1]=key;
				arrIdx[i]=len-1;
			}else {
				int low=0;
				int high=len;
				while(low<high) {
					int mid=low+((high-low)/2);
					if(sequence[mid]<key) {
						low=mid+1;
					}else {
						high=mid;
					}
				}
				sequence[low]=key;
				arrIdx[i]=low;
			}
		}
		
		StringBuilder sb=new StringBuilder();
		sb.append(len).append('\n');
		
		int value=len-1;
		Stack<Integer> stack=new Stack<>();
		
		for(int i=N-1;i>=0;i--) {
			if(arrIdx[i]==value) {
				value--;
				stack.push(arr[i]);
			}
		}
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop()).append(' ');
		}
		
		System.out.println(sb);

	}

}
