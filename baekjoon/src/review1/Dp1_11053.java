package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dp1_11053 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		int [] arr=new int[N];
		int [] len=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		br.close();
		
		for(int i=0;i<N;i++) {
			len[i]=1;
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]&&len[i]<len[j]+1) {
					len[i]=len[j]+1;
				}
			}
		}
		
		int max=-1;
		for(int i=0;i<N;i++) {
			max=Math.max(max, len[i]);
		}
		
		System.out.println(max);

	}
	


}
