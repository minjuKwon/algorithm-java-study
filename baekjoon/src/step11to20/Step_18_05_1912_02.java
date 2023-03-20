package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/140
public class Step_18_05_1912_02 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		int [] sequence=new int[n];
		int [] arr=new int[n];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			sequence[i]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		
		arr[0]=sequence[0];
		int max=sequence[0];
		
		for(int i=1;i<n;i++) {
			arr[i]=Math.max(arr[i-1]+sequence[i], sequence[i]);
			max=Math.max(arr[i], max);
		}
		
		System.out.println(max);
		
	}

}
