package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Step_String_04_14425 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		Node root=new Node();
		
		for(int i=0;i<N;i++) {
			String input=br.readLine();
			root.insert(input);
		}
		
		int count=0;
		
		for(int i=0;i<M;i++) {
			String search=br.readLine();
			if(root.search(search)) {
				count++;
			}
		}
		
		br.close();
		
		System.out.println(count);	

	}
	
	static class Node{
		
		Map<Character, Node> child=new HashMap<>();
		boolean isEnd;
		
		void insert(String input) {
			Node node=this;
			int len=input.length();
			for(int i=0;i<len;i++) {
				char ch=input.charAt(i);
				if(!node.child.containsKey(ch)) {
					node.child.put(ch,new Node());
				}
				node=node.child.get(ch);
			}
			node.isEnd=true;
		}
		
		boolean search(String search) {
			Node node=this;
			int len=search.length();
			for(int i=0;i<len;i++) {
				Node child=node.child.get(search.charAt(i));
				if(child==null) {
					return false;
				}
				node=child;
			}
			return node.isEnd;
		}
		
	}

}
