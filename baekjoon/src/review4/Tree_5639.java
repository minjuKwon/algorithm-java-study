package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tree_5639 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		Node head=new Node(Integer.parseInt(br.readLine()));
		
		while(true) {
			String input=br.readLine();
			if(input==null||input.equals("")) break;
			head.insert(Integer.parseInt(input));
		}
		br.close();
		
		StringBuilder sb=new StringBuilder(); 
		
		postOrder(head,sb);
		
		System.out.println(sb);
		
	}
	
	private static void postOrder(Node node, StringBuilder sb) {
		if(node.left!=null) postOrder(node.left,sb);
		if(node.right!=null) postOrder(node.right,sb);
		sb.append(node.num).append('\n');
	}
	
	private static class Node{
		int num;
		Node left, right;
		public Node(int num) {
			this.num=num;
		}
		void insert(int node) {
			if(this.num>node) {
				if(this.left==null) this.left=new Node(node);
				else this.left.insert(node);
			}else {
				if(this.right==null) this.right=new Node(node);
				else this.right.insert(node);
			}
		}
	}

}
