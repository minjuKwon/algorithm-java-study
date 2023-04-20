package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_Stack_04_4949 {
	
	static StringBuilder sb=new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String input=null;
		
		while(true) {
			
			input=br.readLine();
			
			if(input.equals(".")) {
				break;
			}
			
			checkVPS(input);
		}
		
		br.close();
		
		System.out.println(sb);
		
	}
	
	static void checkVPS(String str) {
		
		 int len=str.length();
		 int [] arr=new int[len];
		 int size=0;
		 
		 for(int i=0;i<len;i++) {
			 if(size==0&&(str.charAt(i)==')'||str.charAt(i)==']')) {
				 size=1;
				 break;
			 }
			 else if(str.charAt(i)=='(') {
				 arr[size]=1;
				 ++size;
			 }else if(str.charAt(i)=='[') {
				 arr[size]=2;
				 ++size;
			 }
			 else if(str.charAt(i)==')'){
				 if(arr[size-1]==1) {
					 arr[size-1]=0;
					 --size;					 
				 }else {
					 size=1;
					 break;
				 }
			 }
			 else if(str.charAt(i)==']') {
				 if(arr[size-1]==2) {
					 arr[size-1]=0;
					 --size;					 
				 }
				 else {
					 size=1;
					 break;
				 }
			 }
			 if(size==-1||size>len) {
				 size=1;
				 break;
			 }
			
		 }
		 
		 if(size==0)
			 sb.append("yes").append('\n');
		 else
			 sb.append("no").append('\n');
		 
	}

}
