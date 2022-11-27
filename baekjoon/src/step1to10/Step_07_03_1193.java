package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_07_03_1193 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int cross=1; int preCount=0;
		
		while(true) {
			if(n<=preCount+cross) {
				if(cross%2==1) {
					System.out.print((cross-(n-preCount-1))+"/"+(n-preCount));
					break;
				}else {
					System.out.print((n-preCount)+"/"+(cross-(n-preCount-1)));
					break;
				}
			}else {
				preCount+=cross;
				cross++;
			}
		}
		
	}

}
