package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class String_1764 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		HashMap<String,Integer> map=new HashMap<>(N);
		for(int i=0;i<N;i++)
			map.put(br.readLine(), 0);
		
		int count=0;
		ArrayList<String> str=new ArrayList<>();
		for(int i=0;i<M;i++) {
			String m=br.readLine();
			if(map.containsKey(m)) {
				str.add(m);
				count++;
			}
		}
		
		str.sort(Comparator.naturalOrder());
		
		StringBuilder sb=new StringBuilder();
		for(String s:str)
			sb.append(s).append('\n');
		
		System.out.println(count+"\n"+sb);
		
	}

}
