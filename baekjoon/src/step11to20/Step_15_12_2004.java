package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/166
public class Step_15_12_2004 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		int count2=getCount2(n)-getCount2(n-m)-getCount2(m);
		int count5=getCount5(n)-getCount5(n-m)-getCount5(m);
		
		System.out.println(Math.min(count2, count5));

	}
	
	static int getCount2(int n) {
		int count=0;
		while(n>=2) {
			count+=n/2;
			n/=2;
		}
		return count;
	}
	
	static int getCount5(int n) {
		int count=0;
		while(n>=5) {
			count+=n/5;
			n/=5;
		}
		return count;
	}

}
