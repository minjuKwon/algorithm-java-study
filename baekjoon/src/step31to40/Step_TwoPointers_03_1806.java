package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_TwoPointers_03_1806 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int S=Integer.parseInt(st.nextToken());
		
		int [] arr=new int [N+1];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		int start=0; int end=0;
		int min=Integer.MAX_VALUE; int sum=0;
		
		while(start<=N&&end<=N) {
			if(sum>=S&&min>start-end) {min=start-end;}
			if(sum<S) {sum+=arr[start++];}
			else {sum-=arr[end++];}
		}
		
		if(min==Integer.MAX_VALUE) {System.out.println(0);}
		else {System.out.println(min);}
		
	}

}
