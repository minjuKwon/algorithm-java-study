package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_06_08_5622 {

	public static void main(String[] args) throws IOException{
		
		int [] num=new int []{2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String word=br.readLine();
		int time=0;
		for(int i=0;i<word.length();i++) {
			int ch=word.charAt(i)-'A';
			time+=num[ch]+1;
		}
		
		System.out.println(time);
		
	}

}
