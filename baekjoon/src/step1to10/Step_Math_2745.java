package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_Math_2745 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		String N=st.nextToken();
		int B=Integer.parseInt(st.nextToken());
		br.close();
		
		long answer=0;
		int index=0;
		int temp=0;
		
		int len=N.length()-1;
		
		for(int i=len;i>=0;i--) {
			char ch=N.charAt(i);
			if(ch>='A'&&ch<='Z') {
				temp=ch-55;
			}else {
				temp=ch-'0';
			}
			answer+=temp*Math.pow(B,index++);
		}
		
		System.out.println(answer);
		
	}

}
