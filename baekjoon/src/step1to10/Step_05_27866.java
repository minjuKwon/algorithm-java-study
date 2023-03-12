package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_05_27866 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String S=br.readLine();
		int i=Integer.parseInt(br.readLine());
		
		br.close();
		
		System.out.println(S.charAt(i-1));

	}

}
