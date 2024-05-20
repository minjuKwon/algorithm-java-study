package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PreFixSum_10986 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		long [] arrPreSum=new long[N+1];
		long [] arrRest=new long[M];
		long count=0;
		
		st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			arrPreSum[i]=(Integer.parseInt(st.nextToken())+arrPreSum[i-1])%M;
			if(arrPreSum[i]==0) count++;
			arrRest[(int)arrPreSum[i]]++;
		}
		
		br.close();
		
		for(int i=0;i<M;i++) {
			if(arrRest[i]>1) {
				count+=(arrRest[i]*(arrRest[i]-1))/2;
			}
		}
		
		System.out.println(count);

	}

}
