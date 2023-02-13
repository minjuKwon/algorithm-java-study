package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/154
public class Step_15_03_2609_02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		br.close();
		
		int numA=a;
		int numB=b;
		
		while(numB!=0) {		
			int r=numA%numB;
			numA=numB;
			numB=r;
		}
		
		System.out.println(numA+"\n"+a*b/numA);	

	}
	
}
