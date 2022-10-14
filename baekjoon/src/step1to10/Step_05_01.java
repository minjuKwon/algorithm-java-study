package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_05_01 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		int[]a=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) 
			a[i]=Integer.parseInt(st.nextToken());
		
		Test test=new Test();
		System.out.println(test.sum(a));

	}

}

class Test{
	public long sum(int []a) {
		long sum=0;
		for(int i=0;i<a.length;i++) 
			sum+=a[i];
		return sum;
	}	
}
