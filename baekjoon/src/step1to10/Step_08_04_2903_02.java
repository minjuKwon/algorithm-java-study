package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_08_04_2903_02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		br.close();
		
		int answer=2;
		
		for(int i=1;i<=N;i++) {
			answer=(answer-1)+answer;
		}
		
		System.out.println(answer*answer);

	}

}
