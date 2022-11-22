package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_06_09_2941 {

	public static void main(String[] args) throws IOException{
		
		String [] str= {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		for(int i=0;i<str.length;i++) {
			if(input.contains(str[i]))
				input=input.replace(str[i], "*");
		}
		System.out.println(input.length());
	}

}
