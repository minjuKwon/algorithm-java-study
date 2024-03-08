package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dp1_9184 {
	
	static int [][][] w=new int[21][21][21];

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int a,b,c;
		StringBuilder sb=new StringBuilder();
		
		while(true) {
			st=new StringTokenizer(br.readLine());
			a=Integer.parseInt(st.nextToken());
			b=Integer.parseInt(st.nextToken());
			c=Integer.parseInt(st.nextToken());
			
			if(a==-1&&b==-1&&c==-1) {
				break;
			}
			
			sb.append("w(").append(a).append(", ").append(b)
			.append(", ").append(c).append(") = ").append(w(a,b,c)).append("\n");
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static int w(int a, int b, int c) {
		if(0<=a&&a<=20&&0<=b&&b<=20&&0<=c&&c<=20
				&&w[a][b][c]!=0) {
			return w[a][b][c];
		}
		if(a<=0||b<=0||c<=0) {
			return  w[0][0][0]=1;
		}
		else if(a>20||b>20||c>20) {
			return w[20][20][20]=w(20,20,20);
		}
		else if(a<b&&b<c) {
			return w[a][b][c]= w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
		}
		else {
			return w[a][b][c]= w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
		}
	}
}
