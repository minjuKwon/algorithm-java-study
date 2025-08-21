package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_Geometry_14215 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(st.nextToken());
		br.close();
		
		int max=Integer.max(Integer.max(a,b),c);	
		if((a+b+c-max)>max) System.out.println(a+b+c);
		else {
			if(a==b&&b==c) System.out.println(a*3);
			else System.out.println((a+b+c-max)*2-1);
		}		
		
	}

}
