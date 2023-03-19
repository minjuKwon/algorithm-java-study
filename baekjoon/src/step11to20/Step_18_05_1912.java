package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/140
public class Step_18_05_1912 {
	
	static int [] sequence;
	static Integer [] arr;
	static int max;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		sequence=new int[n];
		arr=new Integer[n];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			sequence[i]=Integer.parseInt(st.nextToken());
		}
		br.close();
		
		arr[0]=sequence[0];
		max=sequence[0];
		
		getMax(n-1);
		
		System.out.println(max);

	}
	
	static int getMax(int n) {
		if(arr[n]==null) {
			arr[n]=Math.max(getMax(n-1)+sequence[n], sequence[n]);
			max=Math.max(arr[n], max);
		}
		return arr[n];
	}

}
