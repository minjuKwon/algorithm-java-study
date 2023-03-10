package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Backtracking_5568 {

	static int[] card;
	static int [] arr;
	static boolean[] visit;
	static HashSet<String> set;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int k=Integer.parseInt(br.readLine());
		
		card=new int[n];
		arr=new int[n];
		visit=new boolean[n];
		set=new HashSet<>();
		
		for(int i=0;i<n;i++) {
			card[i]=Integer.parseInt(br.readLine());
		}
		
		dfs(n,k,0);
		
		System.out.println(set.size());

	}
	
	static void dfs(int n, int k, int depth) {
		
		if(depth==k) {
			String str="";
			for(int num:arr) {
				str+=String.valueOf(num);
			}
			set.add(str);
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(!visit[i]) {
				visit[i]=true;
				arr[depth]=card[i];
				dfs(n,k,depth+1);
				visit[i]=false;
			}
		}
		
	}

}
