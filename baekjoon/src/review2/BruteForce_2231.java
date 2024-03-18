package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BruteForce_2231 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String N=br.readLine();
		int first=N.charAt(0)-'0';
		int len=N.length();
		int num=Integer.parseInt(N);
		br.close();
		
		int range=num-((len-1)*9)-first;
		int result=0;
		
		for(int i=range;i<num;i++) {
			int temp=i;
			int n=i;
			while(n!=0) {
				temp+=n%10;
				n/=10;
			}
			if(temp==num) {
				result=i;
				break;
			}
		}
		
		System.out.println(result);
		
	}

}
