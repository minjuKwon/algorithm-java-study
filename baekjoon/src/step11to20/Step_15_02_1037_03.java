package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Step_15_02_1037_03 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		ArrayList<Integer> list=new ArrayList<>();
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		br.close();
		
		Collections.sort(list);
		
		System.out.println(list.get(0)*list.get(n-1));

	}

}
