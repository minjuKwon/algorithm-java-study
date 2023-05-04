package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_PrefixSum_03_16139 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String S=br.readLine();
		int q=Integer.parseInt(br.readLine());
	
		int len=S.length();
		int[][] arr=new int[len][26];
		
		arr[0][S.charAt(0)-'a']++;
		
		for(int i=1;i<len;i++) {
			int ch=S.charAt(i)-'a';
			for(int j=0;j<26;j++) {
				int preValue=arr[i-1][j];
				if(ch==j) {
					arr[i][j]=preValue+1;
				}else {
					arr[i][j]=preValue;
				}
			}
		}
		
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		while(q-->0) {
			st=new StringTokenizer(br.readLine());
			char a=st.nextToken().charAt(0);
			int l=Integer.parseInt(st.nextToken());
			int r=Integer.parseInt(st.nextToken());
			int num=0;
			if(l==0) {
				num=arr[r][a-'a'];
			}else {
				num=arr[r][a-'a']-arr[l-1][a-'a'];
			}
			sb.append(num).append('\n');
		}
		
		br.close();
		
		System.out.println(sb);

	}

}
