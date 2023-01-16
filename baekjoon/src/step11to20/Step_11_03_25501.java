package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_11_03_25501 {

	static int count;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<T;i++) {
			count=0;
			String str=br.readLine();
			int num=isPalindrome(str);
			sb.append(num).append(' ').append(count).append('\n');
		}
		
		System.out.println(sb);

	}
	
	public static int recursion(String s, int l, int r) {
		count++;
		if(l>=r) return 1;
		else if(s.charAt(l)!=s.charAt(r)) return 0;
		else return recursion(s,l+1,r-1);	
	}
	
	public static int isPalindrome(String s) {
		return recursion(s,0,s.length()-1);
	}

}
