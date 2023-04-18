package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_Stack_03_9012 {
	
	static StringBuilder sb=new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		while(N-->0) {
			checkVPS(br.readLine());
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static void checkVPS(String str) {
		
		 int len=str.length();
		 int [] arr=new int[len];
		 int size=0;
		 
		 for(int i=0;i<len;i++) {
			 
			 if(i==0&&str.charAt(i)==')') {
				 size=1;
				 break;
			 }
			 if(str.charAt(i)=='(') {
				 arr[i]=1;
				 ++size;
			 }else {
				 arr[i-1]=0;
				 --size;
			 }
			 if(size==-1||size>len) {
				 size=1;
				 break;
			 }
			 
		 }
		 
		 if(size==0)
			 sb.append("YES").append('\n');
		 else
			 sb.append("NO").append('\n');
		 
	}

}
