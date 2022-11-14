package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_06_03_10809_02 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String word=br.readLine();
		
		for(char i='a';i<='z';i++) {
			System.out.print(word.indexOf(i)+" ");
		}

	}

}
