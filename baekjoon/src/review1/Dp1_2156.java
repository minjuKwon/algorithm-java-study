package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dp1_2156 {
	
	static int [] arr;
	static Integer [] value;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		arr=new int[N+1];
		value=new Integer[N+1];
		
		for(int i=1;i<=N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		br.close();

		value[0]=0;
		value[1]=arr[1];
		if(N>1) {
			value[2]=arr[1]+arr[2];			
		}
		
		int result=getJuice(N);
		
		System.out.println(result);
		
	}
	
	static int getJuice(int depth) {
		if(value[depth]==null) {
			value[depth]=Math.max(
					Math.max(getJuice(depth-2), getJuice(depth-3)+arr[depth-1])+arr[depth],
					getJuice(depth-1)
					);
		}
		return value[depth];
	}

}
