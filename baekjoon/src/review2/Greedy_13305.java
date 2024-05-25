package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Greedy_13305 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int [] distances=new int[N-1];
		int [] costs=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N-1;i++) {
			distances[i]=Integer.parseInt(st.nextToken());
		}
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			costs[i]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		long value=0;
		long minCost=costs[0];
		for(int i=0;i<N-1;i++) {
			if(costs[i]<minCost) {
				minCost=costs[i];
			}
			value+=(minCost*distances[i]);
			
		}
		
		System.out.println(value);

	}

}
