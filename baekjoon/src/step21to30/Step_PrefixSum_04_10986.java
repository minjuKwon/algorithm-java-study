package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://velog.io/@isohyeon/Java-%EB%B0%B1%EC%A4%80-10986-%EB%82%98%EB%A8%B8%EC%A7%80-%ED%95%A9
public class Step_PrefixSum_04_10986 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());	
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		long [] arrSum=new long[N+1];
		long [] arrRest=new long[M];
		
		long count=0;
		
		st=new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++) {
			arrSum[i]=(Integer.parseInt(st.nextToken())+arrSum[i-1])%M;
			if(arrSum[i]==0) {
				count++;
			}
			arrRest[(int)arrSum[i]]++;
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
