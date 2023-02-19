package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_15_06_3036 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		StringTokenizer st=new StringTokenizer(br.readLine());
		int ringFirst=Integer.parseInt(st.nextToken());
		for(int i=1;i<N;i++) {
			int ringOther=Integer.parseInt(st.nextToken());
			int gcdNum=gcd(ringFirst,ringOther);
			sb.append(ringFirst/gcdNum).append('/').append(ringOther/gcdNum).append('\n');	
		}
		
		System.out.println(sb);

	}
	
	static int gcd(int a , int b) {
		while(b!=0) {
			int r=a%b;
			a=b;
			b=r;
		}
		return a;
	}

}
