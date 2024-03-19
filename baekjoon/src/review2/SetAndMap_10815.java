package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class SetAndMap_10815 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		HashSet<Integer> set=new HashSet<>();
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
				
		StringBuilder sb=new StringBuilder();
		
		int M=Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine());
		
		for(int i=0;i<M;i++) {
			if(set.contains(Integer.parseInt(st.nextToken()))){
				sb.append(1).append(' ');
			}else {
				sb.append(0).append(' ');
			}
		}
		
		br.close();
		
		System.out.println(sb);
		
	}

}
