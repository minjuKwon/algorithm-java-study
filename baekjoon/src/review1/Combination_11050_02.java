package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Combination_11050_02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		br.close();
		
		System.out.println(BC(N,K));

	}
	
	static int BC(int n, int k) {
		if(k==0||n==k)
			return 1;
		return BC(n-1,k-1)+BC(n-1,k);
	}

}
