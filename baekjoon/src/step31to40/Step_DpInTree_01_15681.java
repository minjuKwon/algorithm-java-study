package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Step_DpInTree_01_15681 {
	
	static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	static ArrayList<ArrayList<Integer>> tree=new ArrayList<>();
	static int [] size;

	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int R=Integer.parseInt(st.nextToken());
		int Q=Integer.parseInt(st.nextToken());
		
		size=new int[N+1];
		
		for(int i=0;i<=N;i++) {
			list.add(new ArrayList<>());
			tree.add(new ArrayList<>());
		}
		
		for(int i=1;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			int U=Integer.parseInt(st.nextToken());
			int V=Integer.parseInt(st.nextToken());
			
			list.get(U).add(V);
			list.get(V).add(U);
		}

		makeTree(R,-1);
		countSubtreeNodes(R);
		
		StringBuilder sb=new StringBuilder();
		
		while(Q-->0) {
			int q=Integer.parseInt(br.readLine());
			sb.append(size[q]).append('\n');
		}
		
		br.close();
		
		System.out.println(sb);

	}
	
	static void makeTree(int currentNode, int parent) {
		for(int node:list.get(currentNode)) {
			if(node!=parent) {
				tree.get(currentNode).add(node);
				makeTree(node, currentNode);
			}
		}
	}
	
	static void countSubtreeNodes(int currentNode) {
		size[currentNode]=1;
		for(int node:tree.get(currentNode)) {
			countSubtreeNodes(node);
			size[currentNode]+=size[node];
		}
	}

}
