package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_04_06_10813 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int[] arr=new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=i+1;
		}
		
		StringTokenizer stNum;
		while(M-->0) {
			stNum=new StringTokenizer(br.readLine());
			int i=Integer.parseInt(stNum.nextToken());
			int j=Integer.parseInt(stNum.nextToken());
			int temp=0;
			
			temp=arr[i-1];
			arr[i-1]=arr[j-1];
			arr[j-1]=temp;
		}
		
		br.close();
		
		StringBuilder sb=new StringBuilder();
		for(int num:arr) {
			sb.append(num).append(' ');
		}
		
		System.out.println(sb);
		
	}

}
