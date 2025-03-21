package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Step_10_05_9063 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		if(N==1) {
			System.out.println(0);
			System.exit(0);
		}
		
		int [] x=new int[N];
		int [] y=new int[N];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			x[i]=Integer.parseInt(st.nextToken());
			y[i]=Integer.parseInt(st.nextToken());
		}
		br.close();
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		System.out.println((x[N-1]-x[0])*(y[N-1]-y[0]));

	}

}
