package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/196
public class Step_Stack2_02_17298_02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int [] arr=new int[N];
		int [] stack=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		int top=-1;
		
		for(int i=0;i<N;i++) {
			while(top!=-1&&arr[i]>arr[stack[top]]){
				arr[stack[top]]=arr[i];
				top--;
			}
			top++;
			stack[top]=i;
		}
		
		for(int i=top;i>=0;i--) {
			arr[stack[i]]=-1;
		}
		
		StringBuilder sb=new StringBuilder();
		for(int a:arr) {
			sb.append(a).append(' ');
		}

		System.out.println(sb);
		
	}

}
