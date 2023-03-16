package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://st-lab.tistory.com/125
public class Step_18_03_1904_02 {

	static int [] tiles=new int[1000001];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println(binarySequence(N));

	}
	
	static int binarySequence(int n) {
		
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		
		int sum=0;
		int num1=1;
		int num2=2;
		
		for(int i=2;i<n;i++) {
			sum=(num1+num2)%15746;
			num1=num2;
			num2=sum;
		}
		return sum;
		
	}

}
