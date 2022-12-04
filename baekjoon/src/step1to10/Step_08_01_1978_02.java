package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//출처 : https://st-lab.tistory.com/80
public class Step_08_01_1978_02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int count=0;
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			boolean flag=true;
			int a=Integer.parseInt(st.nextToken());
			if(a==1) continue;
			for(int j=2;j<=Math.sqrt(a);j++) {
				if(a%j==0) {
					flag=false;
					break;
				}
			}
			
			if(flag==true)
				count++;
		}
		
		System.out.println(count);
	
	}

}
