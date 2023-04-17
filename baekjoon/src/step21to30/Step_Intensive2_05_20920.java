package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Step_Intensive2_05_20920 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		String word;
		HashMap<String, Integer> map=new HashMap<>();
		
		while(N-->0) {
			word=br.readLine();
			if(word.length()>=M) {
				map.put(word, map.getOrDefault(word, 0)+1);
			}
		}
		
		br.close();
		
		ArrayList<String> list=new ArrayList<>(map.keySet());
		
		list.sort((o1,o2)->{
			int v1=map.get(o1);
			int v2=map.get(o2);
			if(v1==v2) {
				if(o1.length()==o2.length()) {
					return o1.compareTo(o2);
				}
				return o2.length()-o1.length();
			}
			return v2-v1;
		});
		
		StringBuilder sb=new StringBuilder();
		for(String a:list) {
			sb.append(a).append('\n');
		}
		
		System.out.println(sb);
		
	}

}
