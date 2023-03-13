package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_18_01_24416 {
	
	static int recursiveCount=0;
	static int dynamicCount=0;
	static int [] f;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		br.close();
		
		f=new int[n];
		
		recursiveFib(n);
		dynamicFib(n);
		
		System.out.print(recursiveCount+" ");
		System.out.print(dynamicCount);
		
	}
	
	static int recursiveFib(int n) {
		if(n<3) {			
			recursiveCount++;
			return n;
		}
		return recursiveFib(n-1)+recursiveFib(n-2);
	}
	
	static int dynamicFib(int n) {
		f[0]=f[1]=1;
		for(int i=2;i<n;i++) {
			dynamicCount++;
			f[i]=f[i-1]+f[i-2];
		}
		return f[n-1];
	}

}
