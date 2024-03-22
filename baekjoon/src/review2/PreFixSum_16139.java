package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PreFixSum_16139 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String word=br.readLine();
		int len=word.length();
		
		int [][] arr=new int[len][26];
		arr[0][word.charAt(0)-'a']++;
		
		for(int i=1;i<len;i++) {
			for(int j=0;j<26;j++) {
				if(word.charAt(i)-'a'==j) {
					arr[i][j]=arr[i-1][j]+1;
				}else {
					arr[i][j]=arr[i-1][j];
				}
			}
		}
		
		int N=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			char a=st.nextToken().charAt(0);
			int start=Integer.parseInt(st.nextToken());
			int end=Integer.parseInt(st.nextToken());
			
			if(start==0) {
				sb.append(arr[end][a-'a']).append('\n');
			}else {
				sb.append(arr[end][a-'a']-arr[start-1][a-'a']).append('\n');
			}
		}
		
		System.out.println(sb);

	}

}
