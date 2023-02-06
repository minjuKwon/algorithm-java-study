package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Step_13_04_10816_02 {

	public static void main(String[] args)  throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		HashMap<Integer,Integer> map=new HashMap<>();
		StringTokenizer stN=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int key=Integer.parseInt(stN.nextToken());
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		
		int M=Integer.parseInt(br.readLine());
		StringTokenizer stM=new StringTokenizer(br.readLine());
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<M;i++) {
			int key=Integer.parseInt(stM.nextToken());
			sb.append(map.getOrDefault(key,0)).append(' ');
		}

		System.out.println(sb);
		
	}

}
