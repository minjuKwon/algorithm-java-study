package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/147
public class Step_GreedyAlgorithm_03_11399_02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		int [] arr=new int[1001];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		while(N-->0) {
			arr[Integer.parseInt(st.nextToken())]++;
		}
		
		br.close();
		
		int totalSum=0;
		int preSum=0;
		
		for(int i=0;i<1001;i++) {
			while(arr[i]-->0) {
				totalSum+=(preSum+i); 
				preSum+=i;
			}
		}
		
		System.out.println(totalSum);

	}

}
