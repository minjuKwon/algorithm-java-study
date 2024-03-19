package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SetAndMap_1620 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		HashMap<String,Integer>map=new HashMap<>();
		String [] arr=new String[N+1];
		
		for(int i=1;i<=N;i++) {
			String poketmon=br.readLine();
			map.put(poketmon,i);
			arr[i]=poketmon;
		}
		
		StringBuilder sb=new StringBuilder();
		while(M-->0) {
			String value=br.readLine();
			if(value.charAt(0)>='A') {
				sb.append(map.get(value)).append('\n');
			}else {
				sb.append(arr[Integer.valueOf(value)]).append('\n');
			}
		}
		
		System.out.println(sb);
		
	}

}
