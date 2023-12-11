package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Step_String_03_14725 {
	
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		Node root=new Node();
		
		Node currentNode;
		StringTokenizer st;
		
		while(N-->0) {
			st=new StringTokenizer(br.readLine());
			int K=Integer.parseInt(st.nextToken());
			currentNode=root;
			for(int i=0;i<K;i++) {
				String feed=st.nextToken();
				if(!currentNode.child.containsKey(feed)) {
					currentNode.child.put(feed,new Node());
				}
				currentNode=currentNode.child.get(feed);
			}
		}
		
		br.close();
		
		print(root, 0);
		
		System.out.println(sb);

	}
	
	static void print(Node node, int depth) {
		if(node.child!=null) {
			List<String>keys=new ArrayList<>(node.child.keySet());
			Collections.sort(keys);
			for(String key:keys) {
				for(int i=0;i<depth;i++) {
					sb.append("--");
				}
				sb.append(key).append('\n');
				print(node.child.get(key), depth+1);
			}			
		}
	}
	
	static class Node{
		Map<String, Node> child=new HashMap<>();
	}

}
