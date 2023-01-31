package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_12_05_1436 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		String numStr="666";
		int count=0;
		while(true) {
			if(numStr.contains("666")) {
				count++;
			}
			if(count==N)
				break;
			int nInt=Integer.parseInt(numStr)+1;
			numStr=String.valueOf(nInt);
		}
		
		System.out.println(numStr);

	}

}
