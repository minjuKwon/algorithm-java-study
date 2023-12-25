package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Intensive2_26069 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		HashSet<String> set=new HashSet<>();
		set.add("ChongChong");
		int count=1;
		
		StringTokenizer st;
		while(N-->0) {
			st=new StringTokenizer(br.readLine());
			String a=st.nextToken();
			String b=st.nextToken();
			
			if(set.contains(a)) {
				if(!set.contains(b)) {
					set.add(b);
					count++;
				}
			}else if(set.contains(b)) {
				if(!set.contains(a)) {
					set.add(a);
					count++;
				}
			}
		}
		
		br.close();
		
		System.out.println(count);

	}

}
