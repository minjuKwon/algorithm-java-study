package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Step_TwoPointers_04_1644 {
	
	static ArrayList<Integer> list=new ArrayList<>();
	static boolean [] checked;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		br.close();
	
		checked=new boolean[N+1];
		
		getPrime(N);
		
		int start=0; int end=0;
		int sum=0; int count=0;
		
		while(true) {
			
			if(sum>=N) {
				sum-=list.get(start++);
			}else if(end==list.size()) {
				break;
			}else {
				sum+=list.get(end++);
			}
			
			if(sum==N) {
				count++;
			}
		
		}
	
		System.out.println(count);

	}
	
	static void getPrime(int n) {
		
		checked[0]=checked[1]=true;
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(checked[i])continue;
			for(int j=i*i;j<=n;j+=i) {
				checked[j]=true;
			}
		}
		
		for(int i=2;i<=n;i++) {
			if(!checked[i]) {
				list.add(i);
			}
		}
		
	}

}
