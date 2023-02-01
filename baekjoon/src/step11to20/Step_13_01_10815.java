package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Step_13_01_10815 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> set=new HashSet<>();
		
		int N=Integer.parseInt(br.readLine());
		StringTokenizer stN=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int numN=Integer.parseInt(stN.nextToken());
			set.add(numN);
		}
		
		int M=Integer.parseInt(br.readLine());
		StringTokenizer stM=new StringTokenizer(br.readLine());
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<M;i++) {
			int numM=Integer.parseInt(stM.nextToken());
			if(set.contains(numM)) 
				sb.append(1).append('\n');
			else
				sb.append(0).append('\n');
		}
		
		System.out.println(sb);

	}

}
