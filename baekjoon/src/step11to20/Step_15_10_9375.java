package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/164
public class Step_15_10_9375 {

	public static void main(String[] args) throws IOException{
		
		HashMap<String,Integer> map;
		StringTokenizer st;
		
		StringBuilder sb=new StringBuilder();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
	
		while(T-->0) {
			
			map=new HashMap<String,Integer>();
			int n=Integer.parseInt(br.readLine());
			
			for(int i=0;i<n;i++) {
				
				st=new StringTokenizer(br.readLine());
				st.nextToken();
				String key=st.nextToken();
				
				if(map.containsKey(key)) {
					map.put(key, map.get(key)+1);
				}else {
					map.put(key, 1);
				}
				
			}
			
			int answer=1;
			for(int val:map.values()) {
				answer*=(val+1);
			}
			
			sb.append(answer-1).append('\n');
			
		}
		
		br.close();
		
		System.out.println(sb);
	}

}
