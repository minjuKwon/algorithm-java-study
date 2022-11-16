package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_06_05_1157 {

	public static void main(String[] args) throws IOException{
		
		int [] alphabet=new int[26];
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String intWord=br.readLine();
		String outWord=intWord.toLowerCase();
		
		int n;
		for(int i=0;i<outWord.length();i++) {
			n=outWord.charAt(i)-'a';
			++alphabet[n];
		}
		
		int max=-2;
		char ch='?';
		for(int i=0;i<alphabet.length;i++) {
			if(alphabet[i]>max) {
				max=alphabet[i];
				ch=(char)('A'+i);
			}				
			else if(alphabet[i]==max) 
				ch='?';
		}
				
		System.out.println(ch);

	}

}
