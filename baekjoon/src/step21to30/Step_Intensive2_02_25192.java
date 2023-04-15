package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Step_Intensive2_02_25192 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int count=0;
		
		HashSet<String> set=new HashSet<String>();
		while(N-->0) {
			String user=br.readLine();
			if(user.equals("ENTER")) {
				count+=set.size();
				set.clear();
			}else {
				set.add(user);				
			}
		}
		
		count+=set.size();
		
		System.out.println(count);

	}

}
