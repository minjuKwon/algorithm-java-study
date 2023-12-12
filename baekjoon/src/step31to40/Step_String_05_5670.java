package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Step_String_05_5670 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		List<String>words;
		Node root;
		String input;		
		
		while((input=br.readLine())!=null&&!input.isEmpty()) {
			int t=Integer.parseInt(input);
			root=new Node();
			double answer=0;
			words=new ArrayList<>();
			for(int i=0;i<t;i++) {
				String word=br.readLine();
				root.insert(word);
				words.add(word);
			}
			for(String word:words) {	
				answer+=root.search(word);			
			}
			sb.append(String.format("%.2f", answer/t)).append('\n');
		}
		
		br.close();

		System.out.println(sb);
		
	}
	
	static class Node{
		Map<Character, Node> child=new HashMap<>();
		boolean isEnd;
		
		void insert(String word) {
			Node node=this;
			int len=word.length();
			for(int i=0;i<len;i++) {
				char ch=word.charAt(i);
				if(!node.child.containsKey(ch)) {
					node.child.put(ch, new Node());
				}
				node=node.child.get(ch);
			}
			node.isEnd=true;
		}
		
		int search(String word) {
			Node node=this;
			node=node.child.get(word.charAt(0));
			int count=1;
			int len=word.length();
			for(int i=1;i<len;i++) {
				if(node.child.size()>1||(node.isEnd&&node.child.size()==1)) {
					count++;
				}
				char ch=word.charAt(i);
				node=node.child.get(ch);
			}
			return count;
		}
		
	}

}
