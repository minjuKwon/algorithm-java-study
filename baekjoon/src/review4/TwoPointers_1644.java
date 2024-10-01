package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TwoPointers_1644 {

	static ArrayList<Integer> list=new ArrayList<>();
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		br.close();
		
		check(N);
		
		int start=0; int end=0;
		int count=0; int sum=0;
		
		while(true) {
			if(sum>=N) sum-=list.get(start++);
			else if(end==list.size()) break;
			else sum+=list.get(end++);
			if(sum==N) count++;
		}
		
		System.out.println(count);

	}
	
	static void check(int N) {
		
		boolean [] isPrime=new boolean[N+1];
		isPrime[0]=isPrime[1]=true;
		
		for(int i=2;i<=Math.sqrt(N);i++) {
			if(isPrime[i]) continue;
			for(int j=i*i;j<=N;j+=i) {
				isPrime[j]=true;
			}
		}
		
		for(int i=2;i<=N;i++) {
			if(!isPrime[i]) list.add(i);
		}
		
	}

}
