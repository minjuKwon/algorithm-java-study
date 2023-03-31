package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://st-lab.tistory.com/134
public class Step_Dp1_10_10844 {
	
	static Long [][] stairsNum;
	static int N;
	final static long MOD=1000000000;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		br.close();
		
		stairsNum=new Long[N+1][10];
		
		for(int i=0;i<10;i++) {
			stairsNum[1][i]=1L;
		}
		
		long result=0;
		for(int i=1;i<10;i++) {
			result+=getCount(N,i);
		}
		
		System.out.println(result%MOD);
		
	}
	
	static long getCount(int digit, int value) {
		
		if(digit==1) {
			return stairsNum[digit][value];
		}
		
		if(stairsNum[digit][value]==null) {
			if(value==0) {
				stairsNum[digit][value]=getCount(digit-1,1);
			}else if(value==9) {
				stairsNum[digit][value]=getCount(digit-1,8);
			}else {
				stairsNum[digit][value]=getCount(digit-1,value-1)+getCount(digit-1,value+1);
			}
		}
		
		return stairsNum[digit][value]%MOD;
		
	}

}
