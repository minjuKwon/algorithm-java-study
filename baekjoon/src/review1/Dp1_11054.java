package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dp1_11054 {

	static int [] arr;
	static int [] arrIn;
	static int [] arrDe;
	static int N;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());

		arr=new int[N];
		arrIn=new int[N];
		arrDe=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		br.close();
		
		increase();
		decrease();
		
		int max=arrIn[0]+arrDe[0];
		for(int i=1;i<N;i++) {
			max=Math.max(max, arrIn[i]+arrDe[i]);
		}
		
		System.out.println(max-1);
	
	}
	
	static void increase() {
		for(int i=0;i<N;i++) {
			arrIn[i]=1;
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]&&arrIn[j]+1>arrIn[i]) {
					arrIn[i]=arrIn[j]+1;
				}
			}
		}
	}
	
	static void decrease() {
		for(int i=N-1;i>=0;i--) {
			arrDe[i]=1;
			for(int j=N-1;j>i;j--) {
				if(arr[i]>arr[j]&&arrDe[j]+1>arrDe[i]) {
					arrDe[i]=arrDe[j]+1;
				}
			}
		}
	}

}
