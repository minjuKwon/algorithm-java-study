package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_05_02_2566 {

	public static void main(String[] args) throws IOException {

		int[][]arr=new int[9][9];
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int i=0;i<arr.length;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		int max=0;
		int x=0; int y=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(max<arr[i][j]) {
					max=arr[i][j];
					x=i;
					y=j;
				}
			}
		}
		
		System.out.print(max+"\n"+(x+1)+" "+(y+1));
		
	}

}
