package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_07_05_10250 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int H=Integer.parseInt(st.nextToken());
			int W=Integer.parseInt(st.nextToken());
			int N=Integer.parseInt(st.nextToken());
			
			int y=N/H;
			int x=N%H;
			
			if(x==0) {
				System.out.println((100*H)+y);
			}
			else {
				System.out.println((100*x)+(y+1));				
			}
		}
		
	}

}
