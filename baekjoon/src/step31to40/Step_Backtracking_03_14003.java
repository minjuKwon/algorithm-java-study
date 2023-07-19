package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Step_Backtracking_03_14003 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int [] arr=new int[N+1];
		int [] arrIndex=new int[N+1];
		ArrayList <Integer> list=new ArrayList<>();
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		list.add(Integer.MIN_VALUE);
		
		for(int i=1;i<=N;i++) {
			
			int num=arr[i];
			int left=1; int right=list.size()-1;
			
			if(num>list.get(list.size()-1)) {
				list.add(num);
				arrIndex[i]=list.size()-1;
			}
			
			else {
				while(left<right) {
					int mid=left+(right-left)/2;
					if(list.get(mid)>=num) {right=mid;} else {left=mid+1;}
				}
				list.set(right, num);
				arrIndex[i]=right;
			}
			
		}
		
		StringBuilder sb=new StringBuilder();
		
		sb.append(list.size()-1).append('\n');
		
		Stack<Integer> stack=new Stack<>();
		
		int index=list.size()-1;
		
		for(int i=N;i>0;i--) {
			if(arrIndex[i]==index) {
				index--;
				stack.push(arr[i]);
			}
		}
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop()).append(' ');
		}
		
		System.out.println(sb);

	}

}
