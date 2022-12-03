package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_08_01_1978 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		boolean flag=true;
		int count=0;
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			int a=Integer.parseInt(st.nextToken());
			if(a==1) continue;
			for(int j=2;j<a;j++) {
				if(a%j==0)
					flag=false;
			}
			if(flag==true)
				count++;
			flag=true;
		}
		
		System.out.println(count);

	}

}
