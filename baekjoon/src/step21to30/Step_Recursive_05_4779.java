package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_Recursive_05_4779 {
	
	static char [] arr;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N;
		String input="";
		
		StringBuilder sb=new StringBuilder();
	
		while((input=br.readLine())!=null&&!input.isEmpty()) {
			
			N=Integer.parseInt(input);
			int length=(int)Math.pow(3, N);
			
			arr=new char[length];

			for(int i=0;i<length;i++) {
				arr[i]='-';				
			}
			
			cantorSet(0,length);
			
			for(int i=0;i<length;i++)
				sb.append(arr[i]);
			sb.append('\n');
			
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static void cantorSet(int start, int len) {
		
		if(len<3) {
			return;			
		}
		
		int size=len/3;

		for(int i=start+size;i<start+size*2;i++) {
			arr[i]=' ';
		}
		
		cantorSet(start,size);
		cantorSet(start+size*2,size);
		
	}

}
