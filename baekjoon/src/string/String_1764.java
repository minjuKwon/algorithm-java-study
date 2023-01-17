package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

public class String_1764 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		HashSet<String> set=new HashSet<>();
		for(int i=0;i<N;i++)
			set.add(br.readLine());

		ArrayList<String> str=new ArrayList<>();
		for(int i=0;i<M;i++) {
			String m=br.readLine();
			if(set.contains(m)) {
				str.add(m);
			}
		}
		
		str.sort(Comparator.naturalOrder());
		
		StringBuilder sb=new StringBuilder();
		sb.append(str.size()).append('\n');
		for(String s:str)
			sb.append(s).append('\n');
		
		System.out.println(sb);
		
	}

}
