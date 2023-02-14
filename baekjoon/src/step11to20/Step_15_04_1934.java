package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_15_04_1934 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<T;i++) {
			
			StringTokenizer st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			int numA=a; 
			int numB=b;
			
			while(numB!=0) {
				int r=numA%numB;
				numA=numB;
				numB=r;
			}
			
			sb.append(a*b/numA).append('\n');
			
		}
		
		br.close();
		
		System.out.println(sb);

	}

}
