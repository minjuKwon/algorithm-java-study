package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_08_03_11653 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int num=N;
		for(int i=2;i<=N;i++) {
			boolean flag=true;
			while(flag) {
				if(num%i==0) {
					System.out.println(i);	
					num/=i;
					if(num==1) {
						break;
					}
				}
				else {
					flag=false;
				}
			}
		}

	}

}
