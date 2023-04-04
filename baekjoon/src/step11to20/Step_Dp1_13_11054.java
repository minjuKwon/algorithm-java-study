package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_Dp1_13_11054 {
	
	static int [] sequence;
	static Integer [] dpI;
	static Integer [] dpD;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		sequence=new int[N];
		dpI=new Integer[N];
		dpD=new Integer[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			sequence[i]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		for(int i=0;i<N;i++) {
			LIS(i);
			LDS(i);
		}
		
		int max=-1;
		for(int i=0;i<N;i++) {
			max=Math.max(max, dpI[i]+dpD[i]);
		}
		
		System.out.println(max-1);
		
	}
	
	static int LIS(int n) {
		if(dpI[n]==null) {
			dpI[n]=1;
			for(int i=n-1;i>=0;i--) {
				if(sequence[i]<sequence[n]) {
					dpI[n]=Math.max(dpI[n], LIS(i)+1);
				}
			}
		}
		return dpI[n];
	}
	
	static int LDS(int n) {
		if(dpD[n]==null) {
			dpD[n]=1;
			for(int i=n+1;i<dpD.length;i++) {
				if(sequence[i]<sequence[n]) {
					dpD[n]=Math.max(dpD[n], LDS(i)+1);
				}
			}
		}
		return dpD[n];
	}

}
