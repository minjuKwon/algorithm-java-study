package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_Dp3_01_11723 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int M=Integer.parseInt(br.readLine());
		
		int S=0;
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		while(M-->0) {
			st=new StringTokenizer(br.readLine());
			String operator=st.nextToken();
			
			if(operator.equals("all")) {
				S=(1<<21)-1;
			}else if(operator.equals("empty")) {
				S=0;
			}else {
				int num=Integer.parseInt(st.nextToken());
				if(operator.equals("add")) {
					S|=(1<<num);
				}else if(operator.equals("remove")) {
					S&=~(1<<num);
				}else if(operator.equals("check")) {
					sb.append( (S&(1<<num)) !=0 ? 1 : 0 ).append('\n');
				}else if(operator.equals("toggle")) {
					S^=(1<<num);
				}
			}
			
		}
		
		br.close();
		
		System.out.println(sb);

	}

}
