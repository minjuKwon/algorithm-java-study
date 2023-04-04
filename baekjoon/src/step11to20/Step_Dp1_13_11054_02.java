package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_Dp1_13_11054_02 {

	static int N;
	static int [] sequence;
	static int [] dpI;
	static int [] dpD;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		
		sequence=new int[N];
		dpI=new int[N];
		dpD=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			sequence[i]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		LIS();
		LDS();
		
		int max=-1;
		for(int i=0;i<N;i++) {
			max=Math.max(max, dpI[i]+dpD[i]);
		}
		
		System.out.println(max-1);
	
	}
	
	static void LIS() {
		for(int i=0;i<N;i++) {
			dpI[i]=1;
			for(int j=0;j<i;j++) {
				if(sequence[i]>sequence[j]&&dpI[i]<dpI[j]+1) {
					dpI[i]=dpI[j]+1;
				}
			}
		}
	}
	
	static void LDS() {
		for(int i=N-1;i>=0;i--) {
			dpD[i]=1;
			for(int j=N-1;j>i;j--) {
				if(sequence[i]>sequence[j]&&dpD[i]<dpD[j]+1) {
					dpD[i]=dpD[j]+1;
				}
			}
		}
	}

}
