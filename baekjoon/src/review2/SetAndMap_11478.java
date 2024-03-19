package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class SetAndMap_11478 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String word=br.readLine();
		br.close();
		
		HashSet<String> set=new HashSet<>();
		for(int i=0;i<word.length();i++) {
			for(int j=i;j<word.length();j++) {
				set.add(word.substring(i,j+1));
			}
		}
		
		System.out.println(set.size());

	}

}
