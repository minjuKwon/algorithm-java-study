package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_09_03_9506 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder answer=new StringBuilder();
		int num=Integer.parseInt(br.readLine());
		
		while(num!=-1) {
			int sum=0;
			StringBuilder sb=new StringBuilder();
			
			for(int i=1;i<num;i++) {
				if(num%i==0) {
					sum+=i;
					sb.append(i+" + ");
				}
			}
			
			if(sum==num) {
				int len=sb.length();
				sb.delete(len-3,len-1);
				answer.append(num).append(" = ").append(sb).append('\n');
			}else {
				answer.append(num).append(" is NOT perfect.").append('\n');
			}
			num=Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		System.out.println(answer);

	}

}
