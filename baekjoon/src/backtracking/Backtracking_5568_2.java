package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Backtracking_5568_2 {

	static int[] card;
	static boolean[] visit;
	static HashSet<String> set;
	static int n;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		int k=Integer.parseInt(br.readLine());
		
		card=new int[n];
		visit=new boolean[n];
		set=new HashSet<>();
		
		for(int i=0;i<n;i++) {
			card[i]=Integer.parseInt(br.readLine());
		}
		
		dfs(k,"");
		
		System.out.println(set.size());

	}
	
	static void dfs(int k, String num) {
		
		if(k==0) {
			set.add(num);
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(!visit[i]) {
				visit[i]=true;
				dfs(k-1,num+card[i]);
				visit[i]=false;
			}
		}
		
	}

}
