package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dp1_1904 {
	
	static int [] titles=new int[1_000_001];

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		br.close();
		
		titles[1]=1;
		titles[2]=2;
		
		if(N<3) {
			System.out.println(titles[N]);
			System.exit(0);
		}
		
		for(int i=3;i<=N;i++) {
			titles[i]=(titles[i-1]+titles[i-2])%15746;
		}
		
		System.out.println(titles[N]);

	}

}
