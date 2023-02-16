package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//https://st-lab.tistory.com/155
public class Step_15_05_2981_3 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		br.close();
		
		Arrays.sort(arr);
		
		int gcdVal=arr[1]-arr[0];
		for(int i=2;i<N;i++) {
			gcdVal=gcd(gcdVal,arr[i]-arr[i-1]);
		}
		
		ArrayList<Integer> list=new ArrayList<>();
		StringBuilder sb=new StringBuilder();
		for(int i=2;i<=Math.sqrt(gcdVal);i++) {
			if(i*i==gcdVal) {
				list.add(i);
			}else if(gcdVal%i==0) {
				list.add(i);
				list.add(gcdVal/i);
			}
		}
		
		Collections.sort(list);
		
		for(int a:list) {
			sb.append(a).append(" ");
		}
		sb.append(gcdVal);
		
		System.out.println(sb);

	}
	
	static int gcd(int a,int b) {
		while(b!=0) {
			int r=a%b;
			a=b;
			b=r;
		}return a;
	}

}
