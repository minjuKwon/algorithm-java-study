package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backtracking_2961 {

	
	static int [] sour;
	static int [] bitter;
	static boolean [] visited;
	static int N;
	static int min=Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		
		sour=new int[N];
		bitter=new int[N];
		visited=new boolean[N];
		
		for(int i=0;i<N;i++) {
			String [] input=br.readLine().split(" ");
			sour[i]=Integer.parseInt(input[0]);
			bitter[i]=Integer.parseInt(input[1]);
		}
		
		br.close();
		
		BT(0,1,0);
		
		System.out.println(min);

	}
	
	static void BT(int depth, int S, int B) {
		
		if(S!=1&&B!=0) min=Math.min(min, Math.abs(S-B));
		
		if(depth==N) {
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(!visited[i]) {
				visited[i]=true;
				BT(depth+1,S*sour[i], B+bitter[i]);
				visited[i]=false;
			}
		}
		
	}

}
