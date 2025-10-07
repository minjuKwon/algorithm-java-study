package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Step_09_02_2501_02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1;i*i<=N;i++) {
			if(N%i==0) {
				list.add(i);
				if(i != N/i) list.add(N/i);
			}
		}
		
		Collections.sort(list);
		
		if(K>list.size()) System.out.println(0);
		else System.out.println(list.get(K-1));

	}

}
