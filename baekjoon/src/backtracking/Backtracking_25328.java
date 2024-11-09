package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Backtracking_25328 {
	
	static int K;
	static boolean [] visited;
	static Map<String,Integer> map=new HashMap<>();

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		char [] X=br.readLine().toCharArray();
		char [] Y=br.readLine().toCharArray();
		char [] Z=br.readLine().toCharArray();
		K=Integer.parseInt(br.readLine());
		br.close();
		
		visited=new boolean[X.length];
		dp(0,0,X,"");
		
		visited=new boolean[Y.length];
		dp(0,0,Y,"");
		
		visited=new boolean[Z.length];
		dp(0,0,Z,"");
		
		ArrayList<String> list=new ArrayList<>();
		
		StringBuilder sb=new StringBuilder();
		for(String key:map.keySet()) {
			if(map.get(key)>1) list.add(key);
		}
		
		Collections.sort(list);
		
		if(list.isEmpty()) System.out.println(-1);
		else {
			for(String s:list) sb.append(s).append('\n');
			System.out.println(sb);
		}
		
	}
	
	static void dp(int depth, int idx, char [] arr, String str) {
		if(depth==K) {
			map.put(str, map.getOrDefault(str, 0)+1);
			return;
		}
		for(int i=idx;i<arr.length;i++) {
			if(!visited[i]) {
				visited[i]=true;
				dp(depth+1,i,arr,str+arr[i]);
				visited[i]=false;
			}
		}
	}

}
