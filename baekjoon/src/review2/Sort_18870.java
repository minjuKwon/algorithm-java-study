package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Sort_18870 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		int [] original=new int[N];
		int [] sorted=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int value=Integer.parseInt(st.nextToken());
			original[i]=value;
			sorted[i]=value;
		}
		br.close();
		
		Arrays.sort(original);
		
		int rank=0;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<N;i++) {
			if(!map.containsKey(original[i])) {
				map.put(original[i], rank);
				rank++;
			}
		}
		
		StringBuilder sb=new StringBuilder();
		for(int v:sorted) {
			int ranking=map.get(v);
			sb.append(ranking).append(' ');
		}
		
		System.out.println(sb);

	}

}
