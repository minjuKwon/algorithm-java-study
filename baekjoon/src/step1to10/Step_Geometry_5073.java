package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Step_Geometry_5073 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		while(true){
			String [] input=br.readLine().split(" ");
			int [] arr=new int[3];
			arr[0]=Integer.parseInt(input[0]);
			arr[1]=Integer.parseInt(input[1]);
			arr[2]=Integer.parseInt(input[2]);			
			
			if(arr[0]==0&&arr[1]==0&&arr[2]==0) break;
			
			Arrays.sort(arr);
			
			if(arr[2]<arr[0]+arr[1]) {
				if(arr[0]==arr[1]&&arr[1]==arr[2]&&arr[0]==arr[2]) 
					sb.append("Equilateral").append('\n');
				else if(arr[0]==arr[1]||arr[0]==arr[2]||arr[1]==arr[2])
					sb.append("Isosceles").append('\n');
				else sb.append("Scalene").append('\n');
			}else {
				sb.append("Invalid").append('\n');
			}
		}
		br.close();
		
		System.out.println(sb);

	}

}
