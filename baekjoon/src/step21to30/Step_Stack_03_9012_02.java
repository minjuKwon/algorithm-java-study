package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://st-lab.tistory.com/178
public class Step_Stack_03_9012_02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		
		while(N-->0) {
			sb.append(checkVPS(br.readLine())).append('\n');
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static String checkVPS(String str) {
		
		int count=0;
		
		for(char c : str.toCharArray()) {
			if(c=='(') {
				count++;
			}
			else if(count==0) {
				return "NO";
			}else {
				count--;
			}
		}
		
		if(count==0) 
			return "YES";
		else
			return "NO";
		
	}

}
