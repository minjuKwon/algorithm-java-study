package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_19_09_1463_02 {
//https://st-lab.tistory.com/133
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		br.close();
		
		System.out.println(getCount(N,0));
		
	}
	
	static int getCount(int n, int count) {
		if(n<2) {
			return count;
		}
		return Math.min(getCount(n/2,count+1+(n%2)), getCount(n/3,count+1+(n%3)));
	}

}
