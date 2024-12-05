package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backtracking_2961_02 {

	static int [] sour;
	static int [] bitter;
	static int N;
	static int min=Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		sour=new int[N];
		bitter=new int[N];
		
		for(int i=0;i<N;i++) {
			String [] input=br.readLine().split(" ");
			sour[i]=Integer.parseInt(input[0]);
			bitter[i]=Integer.parseInt(input[1]);
		}		
		
		br.close();
		
		BT(0,0,1,0);
		
		System.out.println(min);

	}
	
	static void BT(int depth, int choiceCnt, int S, int B) {
		
		if(depth==N) {
			if(choiceCnt>0) {
				min=Math.min(Math.abs(S-B), min);
			}
			return;
		}
		
		BT(depth+1,choiceCnt,S,B);
		BT(depth+1,choiceCnt+1,S*sour[depth],B+bitter[depth]);
		
	}

}
