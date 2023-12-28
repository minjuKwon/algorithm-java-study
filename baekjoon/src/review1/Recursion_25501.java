package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion_25501 {

	static int count;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		while(N-->0) {
			count =0;
			String input=br.readLine();
			sb.append(recurison(input, 0, input.length()-1)).append(' ').append(count).append('\n');
		}
		
		br.close();
		
		System.out.println(sb);
		
	}
	
	static int recurison(String word, int l, int r) {
		count++;
		if(l>=r) return 1;
		else if(word.charAt(l)!=word.charAt(r)) return 0;
		else return recurison(word, l+1, r-1);
	}

}

