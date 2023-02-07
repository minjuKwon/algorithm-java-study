package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_14_02_3009 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		int [][] arr=new int[3][3];
		for(int i=0;i<3;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			arr[0][i]=Integer.parseInt(st.nextToken());
			arr[1][i]=Integer.parseInt(st.nextToken());
		}	
		
		StringBuilder sb=new StringBuilder();
		if(arr[0][0]==arr[0][1])
			sb.append(arr[0][2]).append(' ');
		else
			if(arr[0][0]==arr[0][2])
				sb.append(arr[0][1]).append(' ');
			else sb.append(arr[0][0]).append(' ');
		
		if(arr[1][0]==arr[1][1])
			sb.append(arr[1][2]).append(' ');
		else
			if(arr[1][0]==arr[1][2])
				sb.append(arr[1][1]).append(' ');
			else sb.append(arr[1][0]).append(' ');
			
			System.out.println(sb);
			
		}

}
