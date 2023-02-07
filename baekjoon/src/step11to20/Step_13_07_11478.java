package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Step_13_07_11478 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		br.close();
		
		HashSet<String> set=new HashSet<>();
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				set.add(s.substring(i, j+1));
			}
		}
		System.out.println(set.size());
	}

}
