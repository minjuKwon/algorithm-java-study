package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_GreedyAlgorithm_01_11047 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		int [] coins=new int[N];
		
		for(int i=0;i<N;i++) {
			coins[i]=Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		int count=0;
		int charge=0;
		
		for(int i=N-1;i>=0;i--) {
			if(coins[i]<=K) {
				charge=K/coins[i];
				K=K-(coins[i]*charge);
				count+=charge;
			}
			if(K==0)
				break;
		}

		System.out.println(count);
		
	}

}
