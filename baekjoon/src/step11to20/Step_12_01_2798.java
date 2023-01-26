package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_12_01_2798 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int [] arr=new int[N];
		StringTokenizer stArr=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
			arr[i]=Integer.parseInt(stArr.nextToken());
		
		int answer=blackjack(arr,N,M);
		System.out.println(answer);

	}
	
	static int blackjack(int [] arr, int N, int M) {
		
		int result=0;
		for(int i=0;i<N-2;i++) {
			if(arr[i]>M) 
				continue;
			for(int j=i+1;j<N-1;j++) {
				if(arr[i]+arr[j]>M) 
					continue;
				for(int k=j+1;k<N;k++) {
					int card=arr[i]+arr[j]+arr[k];
					if(card==M) 
						return card;
					if(M>card&&card>result)
						result=card;
				}
			}
		}
		return result;
	}

}
