package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Step_13_03_1620 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		HashMap<String,Integer>map=new HashMap<>();
		String[] arr=new String[N+1];
		
		for(int i=1;i<=N;i++) {
			String dictionary=br.readLine();
			map.put(dictionary,i);
			arr[i]=dictionary;
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<M;i++) {
			String pokemon=br.readLine();
			if(pokemon.charAt(0)>=65) {
				sb.append(map.get(pokemon)).append('\n');
			}else {
				sb.append(arr[Integer.parseInt(pokemon)]).append('\n');
			}
		}

		System.out.println(sb);
		
	}

}
