package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_05_11_11718 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str="";
		
		while((str=br.readLine())!=null&&!str.isEmpty()) {
			System.out.println(str);
		}
		
		br.close();

	}

}
