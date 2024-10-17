package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tree_1991 {
	
	static TreeNode head=new TreeNode('A',null,null);
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			char node=st.nextToken().charAt(0);
			char left=st.nextToken().charAt(0);
			char right=st.nextToken().charAt(0);
			insertNode(head,node,left,right);
		}
		
		preOrder(head);
		sb.append('\n');
		inOrder(head);
		sb.append('\n');
		postOrder(head);
		sb.append('\n');
		
		System.out.println(sb);

	}
	
	static void insertNode(TreeNode node, char root, char left, char right) {
		if(node.data==root) {
			node.left=(left=='.')? null : new TreeNode(left,null,null);
			node.right=(right=='.')?null:new TreeNode(right,null,null);
		}else {
			if(node.left!=null) insertNode(node.left,root,left,right);
			if(node.right!=null) insertNode(node.right,root,left,right);
		}
	}
	
	static void preOrder(TreeNode node) {
		if(node==null) return;
		sb.append(node.data);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	static void inOrder(TreeNode node) {
		if(node==null) return;
		inOrder(node.left);
		sb.append(node.data);
		inOrder(node.right);
	}
	
	static void postOrder(TreeNode node) {
		if(node==null) return;
		postOrder(node.left);
		postOrder(node.right);
		sb.append(node.data);
	}

}

class TreeNode{
	char data;
	TreeNode left;
	TreeNode right;
	public TreeNode(char data, TreeNode left, TreeNode right) {
		this.data=data;
		this.left=left;
		this.right=right;
	}
}
