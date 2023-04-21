package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://st-lab.tistory.com/182
public class Step_Stack_05_1874_02 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int [] stack=new int[n];
		
		int idx=0;
		int start=0;
		
		int num=0;
		
		StringBuilder sb=new StringBuilder();
		
		while(n-->0) {
			
			num=Integer.parseInt(br.readLine());
			
			if(num>start) {
				for(int i=start+1;i<=num;i++) {
					stack[idx]=i;
					idx++;
					sb.append('+').append('\n');
				}
				start=num;
			}
			else if(stack[idx-1]!=num) {
				System.out.println("NO");
				return;
			}
		
			stack[--idx]=0;
			sb.append('-').append('\n');
			
		}
		
		System.out.println(sb);
	
	}

}
