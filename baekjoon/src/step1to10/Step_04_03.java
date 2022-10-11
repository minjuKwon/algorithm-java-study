package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Step_04_03 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<10;i++)
			set.add(Integer.parseInt(br.readLine())%42);
		
		System.out.println(set.size());

	}

}
