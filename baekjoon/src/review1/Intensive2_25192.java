package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Intensive2_25192 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		HashSet<String>set=new HashSet<>();
		int count=0;
		
		while(N-->0) {
			String input=br.readLine();
			if(input.equals("ENTER")) {
				count+=set.size();
				set.clear();
			}else {
				set.add(input);				
			}
		}
		
		count+=set.size();
		
		System.out.println(count);

	}

}
