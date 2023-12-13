package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_Math1_03_2720 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		int [] costs=new int[]{25, 10, 5, 1};
		
		int T=Integer.parseInt(br.readLine());
		while(T-->0) {
			int money=Integer.parseInt(br.readLine());
			for(int cost: costs) {
				sb.append(money/cost).append(' ');
				money%=cost;
			}
			sb.append('\n');
		}
		
		br.close();
		
		System.out.println(sb);

	}

}
