package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion_4779 {
	
	static char [] arr;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		String input;
		while((input=br.readLine())!=null&&!input.isEmpty()) {
			int N=Integer.parseInt(input);
			int len=(int)Math.pow(3, N);
			
			arr=new char[len];
			
			for(int i=0;i<len;i++) {
				arr[i]='-';
			}
			
			cantor(0, len);
			
			for(int i=0;i<len;i++) {
				sb.append(arr[i]);
			}sb.append('\n');
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static void cantor(int start, int len) {
		if(len<3) return;
		int size=len/3;
		
		for(int i=start+size;i<start+size*2;i++) {
			arr[i]=' ';
		}
		
		cantor(start, size);
		cantor(start+size*2, size);
	}

}
