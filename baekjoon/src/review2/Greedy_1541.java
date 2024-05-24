package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Greedy_1541 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stSub=new StringTokenizer(br.readLine(), "-");
		
		int result=Integer.MAX_VALUE;
		
		while(stSub.hasMoreTokens()) {
			StringTokenizer stAdd=new StringTokenizer(stSub.nextToken(), "+");
			int sum=0;
			while(stAdd.hasMoreTokens()) {
				sum+=Integer.parseInt(stAdd.nextToken());
			}
			if(result==Integer.MAX_VALUE) {
				result=sum;
			}else {
				result-=sum;				
			}
		}
		
		br.close();
		
		System.out.println(result);

	}

}
