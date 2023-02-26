package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_04_05_10810 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int[] arr=new int[N];
		
		StringTokenizer stBall;
		while(M-->0) {
			stBall=new StringTokenizer(br.readLine());
			int i=Integer.parseInt(stBall.nextToken());
			int j=Integer.parseInt(stBall.nextToken());
			int k=Integer.parseInt(stBall.nextToken());
			for(int a=i-1;a<j;a++) {
				arr[a]=k;
			}
		}
		
		br.close();
		
		StringBuilder sb=new StringBuilder();
		for(int num:arr) {
			sb.append(num).append(' ');			
		}
		
		System.out.println(sb);

	}

}
