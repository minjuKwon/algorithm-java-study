package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_04_04_02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int max=-1;
		int score=0;
		double sum=0.0;
		
		for(int i=0;i<n;i++) {
			score=Integer.parseInt(st.nextToken());
			if(score>max)
				max=score;
			sum+=score;	
		}
		
		System.out.println(((sum/max)*100)/n);
		
	}

}
