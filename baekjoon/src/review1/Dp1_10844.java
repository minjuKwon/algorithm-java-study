package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dp1_10844 {
	
	static Long [][] num;
	static long mod=1_000_000_000;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		br.close();
		
		num=new Long [N+1][10];
		for(int i=0;i<10;i++) {
			num[1][i]=1l;
		}
		
		long result=0;
		for(int i=1;i<10;i++) {
			result+=getNum(N,i);
		}
		
		System.out.println(result%mod);

	}
	
	static Long getNum(int digit, int value) {
		if(digit==1) {
			return num[digit][value];
		}
		if(num[digit][value]==null) {
			if(value==0) {
				num[digit][value]=getNum(digit-1, 1);
			}else if(value==9) {
				num[digit][value]=getNum(digit-1, 8);
			}else {
				num[digit][value]=getNum(digit-1, value+1)+getNum(digit-1, value-1);
			}
		}
		return num[digit][value]%mod;
	}

}
