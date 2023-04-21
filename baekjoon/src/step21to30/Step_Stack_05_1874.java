package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_Stack_05_1874 {

	static boolean [] arr;
	static int [] stack;
	static int size=0;
	
	static StringBuilder sb=new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		arr=new boolean[n+1];
		stack=new int[n+1];
		
		while(n-->0) {
			int result=makeSequence(Integer.parseInt(br.readLine()));
			if(result==0)
				break;
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static int makeSequence(int n) {
		for(int i=1;i<=n;i++) {
			if(arr[i]==false) {
				arr[i]=true;
				stack[size]=i;
				size++;
				sb.append('+').append('\n');
			}
		}
		if(stack[size-1]!=n){
			sb.setLength(0);
			sb.append("NO");
			return 0;
		}
		if(stack[size-1]==n) {
			stack[--size]=0;
			sb.append('-').append('\n');
		}
		return 1;
	}

}
