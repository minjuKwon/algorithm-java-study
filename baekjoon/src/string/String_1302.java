package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class String_1302 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		HashMap<String,Integer> map=new HashMap<>();
		int max=0;
		
		while(N-->0) {
			String book=br.readLine();
			map.put(book,map.getOrDefault(book, 0)+1);
			max=Math.max(max, map.get(book));
		}
		
		br.close();
		
		ArrayList<String> list=new ArrayList<>();
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue()==max) {
				list.add(entry.getKey());
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(0));

	}

}
