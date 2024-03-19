package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SetAndMap_10816 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<N;i++) {
			int key=Integer.parseInt(st.nextToken());
			map.put(key, map.getOrDefault(key,0)+1);				
		}
		
		int M=Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine());
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<M;i++) {
			int value=Integer.parseInt(st.nextToken());
			sb.append(map.getOrDefault(value,0)).append(' ');
		}
		
		System.out.println(sb);
		
	}

}
