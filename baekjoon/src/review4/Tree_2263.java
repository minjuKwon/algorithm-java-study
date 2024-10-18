package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tree_2263 {

	static int [] preOrder, inOrder, postOrder;
	static int N,idx=0;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		
		preOrder=new int[N];
		inOrder=new int[N];
		postOrder=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			inOrder[i]=Integer.parseInt(st.nextToken());
		}
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			postOrder[i]=Integer.parseInt(st.nextToken());
		}
		
		getPreOrder(0,N-1, 0, N-1);
		
		StringBuilder sb=new StringBuilder();
		for(int num:preOrder) {
			sb.append(num).append(' ');
		}
		
		System.out.println(sb);

	}
	
	static void getPreOrder(int is, int ie, int ps, int pe){
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
