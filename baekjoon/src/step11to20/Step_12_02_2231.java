package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_12_02_2231 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String strN=br.readLine();
		int len=strN.length();
		int first=strN.charAt(0)-'0';
		
		int N=Integer.parseInt(strN);
		int range=N-((len-1)*9)-first;

		int result=0;
		for(int i=range;i<N;i++) {
			int answer=i;
			int n=i;
			while(n!=0){
				answer+=(n%10);
				n/=10;
			}
			if(answer==N) {
				result=i;
				break;
			}
		}
		
		System.out.println(result);

	}

}
