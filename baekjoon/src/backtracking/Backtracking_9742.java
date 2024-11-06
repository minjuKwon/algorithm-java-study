package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backtracking_9742 {

	static char [] input;
	static char[] output;
	static boolean [] visited;
	static String answer;
	static int n,idx,len;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		while(true) {
			String line=br.readLine();
			if(line==null||line.equals("")) break;
			StringTokenizer st=new StringTokenizer(line);
			input=st.nextToken().toCharArray();
			n=Integer.parseInt(st.nextToken());
			
			idx=0;
			answer="";
			len=input.length;
			
			output=new char[len];
			visited=new boolean[len];
			
			dp(0);
			
			sb.append(input).append(" ").append(n).append(" = ");
			if(n>idx) sb.append("No permutation");
			else sb.append(answer);
			sb.append('\n');
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static void dp(int depth) {
		if(depth==len) {
			idx++;
			if(idx==n) answer=String.valueOf(output);
			return;
		}
		
		for(int i=0;i<len;i++) {
			if(!visited[i]) {
				visited[i]=true;
				output[depth]=input[i];
				dp(depth+1);
				visited[i]=false;
			}
		}
	}

}
