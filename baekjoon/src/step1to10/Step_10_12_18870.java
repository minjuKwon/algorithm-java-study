package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/279
public class Step_10_12_18870 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int [] original=new int[N];
		int [] sorted=new int[N];
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			original[i]=sorted[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(sorted);
		
		int rank=0;
		for(int e : sorted) {
			if(!map.containsKey(e)) {
				map.put(e, rank);
				rank++;
			}
		}
		
		StringBuilder sb=new StringBuilder();
		for(int key:original) {
			int ranking=map.get(key);
			sb.append(ranking).append(' ');
		}
		
		System.out.println(sb);

	}

}
