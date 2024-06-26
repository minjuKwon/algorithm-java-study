package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Greedy_1931 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int [][] arr=new int[N][2];
		
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			arr[i][0]=Integer.parseInt(st.nextToken());
			arr[i][1]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		Arrays.sort(arr, (e1, e2)->{
			if(e1[1]==e2[1]) {
				return e1[0]-e2[0];
			}else {
				return e1[1]-e2[1];
			}
		});
		
		int count=0;
		int preTime=0;
		
		for(int i=0;i<N;i++) {
			if(preTime<=arr[i][0]) {
				preTime=arr[i][1];
				count++;
			}
		}
		
		System.out.println(count);

	}

}
