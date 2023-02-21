package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/159
public class Step_15_07_11050_2 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		System.out.println(BC(N,K));

	}
	
	static int BC(int n, int k) {
		if(n==k||k==0)
			return 1;
		return BC(n-1,k-1)+BC(n-1,k);
	}

}
