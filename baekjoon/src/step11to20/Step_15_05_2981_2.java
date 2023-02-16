package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//https://st-lab.tistory.com/155
public class Step_15_05_2981_2 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int [] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		br.close();
		
		Arrays.sort(arr);
		
		int gcdVal=arr[1]-arr[0];
		for(int i=2;i<N;i++) {
			gcdVal=gcd(gcdVal,arr[i]-arr[i-1]);
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=2;i<=gcdVal/2;i++) {
			if(gcdVal%i==0) {
				sb.append(i).append(" ");				
			}
		}
		
		sb.append(gcdVal);
		
		System.out.println(sb);

	}
	
	static int gcd(int a, int b) {
		while(b!=0) {
			int r=a%b;
			a=b;
			b=r;
		}
		return a;
	}

}
