package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_DivideAndConquer_02_1992 {
	
	static int [][] image;
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		image=new int[N][N];
		
		for(int i=0;i<N;i++) {
			String str=br.readLine();
			for(int j=0;j<N;j++) {
				image[i][j]=str.charAt(j)-'0';
			}
		}
		
		br.close();
		
		quedTree(0,0,N);
		
		System.out.println(sb);

	}
	
	static void quedTree(int row, int column, int size) {
		
		if(checkString(row,column,size)) {
			sb.append(image[row][column]);	
			return;
		}
		
		int newSize=size/2;
		
		sb.append('(');
		
		quedTree(row,column,newSize);
		quedTree(row,column+newSize,newSize);
		quedTree(row+newSize,column,newSize);
		quedTree(row+newSize,column+newSize,newSize);
		
		sb.append(')');
		
	}
	
	static boolean checkString(int row, int column, int size) {
		
		int num = image[row][column];
		
		for(int i=row;i<row+size;i++) {
			for(int j=column;j<column+size;j++) {
				if(image[i][j]!=num) {
					return false;
				}
			}
		}
		
		return true;
		
	}

}
