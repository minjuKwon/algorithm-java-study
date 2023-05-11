package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_GreedyAlgorithm_04_1541 {
//https://st-lab.tistory.com/148
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stSub=new StringTokenizer(br.readLine(),"-");
		
		int sum=Integer.MAX_VALUE;
		
		while(stSub.hasMoreTokens()) {
			
			int value=0;
			
			StringTokenizer stPlus=new StringTokenizer(stSub.nextToken(),"+");
			
			while(stPlus.hasMoreTokens()) {
				value+=Integer.parseInt(stPlus.nextToken());
			}
			
			if(sum==Integer.MAX_VALUE) {
				sum=value;
			}else {
				sum-=value;
			}
			
		}
		
		br.close();
		
		System.out.println(sum);

	}

}
