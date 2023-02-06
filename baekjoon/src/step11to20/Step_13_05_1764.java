package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Step_13_05_1764 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		HashSet<String> set=new HashSet<>();
		for(int i=0;i<N;i++)
			set.add(br.readLine());
		
		ArrayList<String> list=new ArrayList<>();
		for(int i=0;i<M;i++) {
			String name=br.readLine();
			if(set.contains(name)) {
				list.add(name);
			}
		}
		
		Collections.sort(list);
		//list.sort(Comparator.naturalOrder());
		
		StringBuilder sb=new StringBuilder();
		sb.append(list.size()).append('\n');
		for(String person:list)
			sb.append(person).append('\n');
		
		System.out.println(sb);

	}

}
