package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_14_01_1085 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		br.close();
		
		int x=Integer.parseInt(st.nextToken());
		int y=Integer.parseInt(st.nextToken());
		int w=Integer.parseInt(st.nextToken());
		int h=Integer.parseInt(st.nextToken());
		
		int [] arr= {w-x,h-y,x,y};
		int min=arr[0];
		for(int a:arr) {
			if (a<min)
				min=a;
		}
		
		System.out.println(min);

	}

}
