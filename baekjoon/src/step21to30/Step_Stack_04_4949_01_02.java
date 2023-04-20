package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_Stack_04_4949_01_02 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String input=null;
		StringBuilder sb=new StringBuilder();
		
		while(true) {
			
			input=br.readLine();
			
			if(input.equals(".")) {
				break;
			}
			
			sb.append(checkVPS(input)).append('\n');
		}
		
		br.close();
		
		System.out.println(sb);
		
	}
	
	static String checkVPS(String str) {
		
		 char[] stack=new char[str.length()];
		 int size=0;
		 
		 for(char element : str.toCharArray()) {
			 
			 if(element=='('||element=='[') {
				 stack[size]=element;
				 ++size;
			 }
			 
			 else if(element==')'){
				 if(size==0||stack[size-1]!='(') {
					return "no"	;			 
				 }else {
					 --size;
				 }
			 }
			 
			 else if(element==']') {
				 if(size==0||stack[size-1]!='[') {
					 return "no";					 
				 }
				 else {
					--size;
				 }
			 }
		
		 }
		 
		 if(size==0)
			 return "yes";
		 else
			 return "no";
		 
	}

}
