package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_Tree_05_2263 {
	
	static int [] preOrder, inOrder, postOrder;
	static int n, idx;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		n=Integer.parseInt(br.readLine());
		
		preOrder=new int[n];
		inOrder=new int[n];
		postOrder=new int[n];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			inOrder[i]=Integer.parseInt(st.nextToken());
		}
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			postOrder[i]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		getPreOrder(0, n-1, 0, n-1);
		
		StringBuilder sb=new StringBuilder();
		
		for(int num:preOrder) {
			sb.append(num).append(' ');
		}
		
		System.out.println(sb);

	}
	
	static void getPreOrder(int is, int ie, int ps, int pe) {
		
		if(is<=ie&&ps<=pe) {
			
			preOrder[idx++]=postOrder[pe];
			int position=0;
			
			for(int i=is;i<=ie;i++) {
				if(inOrder[i]==postOrder[pe]) {
					position=i;
					break;
				}
			}
			
			getPreOrder(is, position-1, ps, ps+position-is-1);
			getPreOrder(position+1, ie, ps+position-is, pe-1);
			
		}
		
	}

}
