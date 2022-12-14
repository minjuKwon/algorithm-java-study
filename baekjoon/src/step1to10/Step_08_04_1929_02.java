package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//√‚√≥ : https://st-lab.tistory.com/84
public class Step_08_04_1929_02 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int M=Integer.parseInt(st.nextToken());
		int N=Integer.parseInt(st.nextToken());
		
		boolean [] prime=new boolean[N+1];
		StringBuilder sb=new StringBuilder();
		
		for(int i=2;i<=N;i++) {
			if(prime[i]) continue;
			if(i>=M) sb.append(i).append('\n');
			for(int j=i+i;j<=N;j+=i)
				prime[j]=true;
		}
		
		System.out.println(sb);
		
	}

}
