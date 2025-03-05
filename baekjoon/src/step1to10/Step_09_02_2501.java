package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_09_02_2501 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		br.close();
		
		int answer=0;
		int count=1;
		
		for(int i=1;i<=N;i++) {
			if(N%i==0) {
				if(count==K) {
					answer=i;
					break;
				}
				count++;
			}
		}
		
		System.out.println(answer);

	}

}
