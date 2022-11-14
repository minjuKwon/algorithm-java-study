package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_06_04_2675 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int m=Integer.parseInt(st.nextToken());
			String word=st.nextToken();
			char [] arr=word.toCharArray();
			for(int j=0;j<arr.length;j++) {
				for(int k=0;k<m;k++)
					System.out.print(arr[j]);
			}
			System.out.println();
		}
		

	}

}
