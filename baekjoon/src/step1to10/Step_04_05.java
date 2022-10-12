package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_04_05 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int count;
		int sum=0;
		
		for(int i=0;i<n;i++) {
			count=0;
			sum=0;
			String str=new String(br.readLine());
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)=='O') {
						count++;
						sum+=count;
				}
				else if(str.charAt(j)=='X')
					count=0;					
			}
			
			System.out.println(sum);
		
		}
		
	}

}
