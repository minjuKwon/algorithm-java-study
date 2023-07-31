package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_Tree_04_1991 {
	
	static Node head=new Node('A',null,null);
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			
			char root=st.nextToken().charAt(0);
			char left=st.nextToken().charAt(0);
			char right=st.nextToken().charAt(0);
			
			insertNode(head,root,left,right);
		}
		
		preOrder(head);
		sb.append('\n');
		
		inOrder(head);
		sb.append('\n');
		
		postOrder(head);
		sb.append('\n');
		
		System.out.println(sb);

	}
	
	static void insertNode(Node node, char root, char left, char right) {
		if(node.data==root) {
			node.left = (left=='.') ? null : new Node(left,null,null);
			node.right = (right=='.') ? null : new Node(right,null,null);
		}else {
			if(node.left!=null) {insertNode(node.left, root, left, right);}
			if(node.right!=null) {insertNode(node.right, root, left, right);}
		}
	}
	
	static void preOrder(Node node) {
		if(node==null) return;
		sb.append(node.data);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	static void inOrder(Node node) {
		if(node==null) return;
		inOrder(node.left);
		sb.append(node.data);
		inOrder(node.right);
	}
	
	static void postOrder(Node node) {
		if(node==null) return;
		postOrder(node.left);
		postOrder(node.right);
		sb.append(node.data);
	}
	
	static class Node{
		char data;
		Node left;
		Node right;
		
		Node(char data, Node left, Node right){
			this.data=data;
			this.left=left;
			this.right=right;
		}
	}

}


