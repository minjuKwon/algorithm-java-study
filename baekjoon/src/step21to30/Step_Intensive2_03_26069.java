package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Step_Intensive2_03_26069 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		HashMap<String,Boolean> dance=new HashMap<>();
		dance.put("ChongChong",true);
		 
		int count=1;
		StringTokenizer st;
		while(N-- > 0) {
			st=new StringTokenizer(br.readLine());
			String a=st.nextToken();
			String b=st.nextToken();
			if(dance.containsKey(a)) {
				if(!dance.containsKey(b)) {
					dance.put(b, true);
					count++;	
				}
			}
			else if(dance.containsKey(b)) {
				if(!dance.containsKey(a)) {
					dance.put(a, true);
					count++;
				}
			}
		}
		
		System.out.println(count);

	}

}
