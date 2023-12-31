package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Step_13_03_7785 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		Set<String>set=new HashSet<>();
		
		while(N-->0) {
			st=new StringTokenizer(br.readLine());
			String name=st.nextToken();
			String log=st.nextToken();
			if(log.equals("enter")) {
				set.add(name);
			}
			if(log.equals("leave")) {
				set.remove(name);
			}
		}
		
		br.close();
		
		ArrayList<String>list=new ArrayList<>(set);
		
		Collections.sort(list);
		
		StringBuilder sb=new StringBuilder();
		for(int i=list.size()-1;i>=0;i--) {
			sb.append(list.get(i)).append('\n');
		}	
		
		System.out.println(sb);

	}

}
