package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_04_01_10807 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int[]num=new int[n];
		StringTokenizer st;	
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			num[i]=Integer.parseInt(st.nextToken());
		}
		
		int count=0;
		int v=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			if(num[i]==v)
				count++;
		}
		System.out.println(count);
		
	}

}
