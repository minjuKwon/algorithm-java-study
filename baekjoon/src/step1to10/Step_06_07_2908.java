package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_06_07_2908 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n1=Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
		int n2=Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
		
		if(n1>n2)
			System.out.println(n1);
		else
			System.out.println(n2);

	}

}
