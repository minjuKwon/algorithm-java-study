package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//출처 : https://yongku.tistory.com/1434
public class Step_07_07_2839_02 {

	public static void main(String[] args) throws IOException{
		
		int m=0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		while(true) {
			if(n%5==0) {
				m+=n/5;
				System.out.println(m);
				break;
			}else {
				n-=3;
				m++;
			}
			if(n<0) {
				System.out.println("-1");
				break;
			}
		}			

	}

}
