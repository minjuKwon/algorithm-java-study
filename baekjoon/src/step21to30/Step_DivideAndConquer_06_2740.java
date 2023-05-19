package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://www.acmicpc.net/problem/2740
public class Step_DivideAndConquer_06_2740 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int [][] arrA=new int[128][128];
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				arrA[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		st=new StringTokenizer(br.readLine());
		M=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		int [][] arrB=new int[128][128];
		
		for(int i=0;i<M;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<K;j++) {
				arrB[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		br.close();
		
		int max=Math.max(Math.max(N, K), M);
		int size=1;
		
		while(true) {
			if(size>=max) {
				break;
			}
			size*=2;
		}
		
		int [][] arrC=multiply(arrA,arrB,size);
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<K;j++) {
				sb.append(arrC[i][j]+" ");
			}
			sb.append('\n');
		}

		System.out.println(sb);
		
	}
	
	static int[][] multiply(int[][] arrA, int [][] arrB, int size){
		
		int [][] arrC=new int[size][size];
		
		if(size==1) {
			arrC[0][0]=arrA[0][0]*arrB[0][0];
			return arrC;
		}
		
		int newSize=size/2;
		
		int [][] a11=subArray(arrA,0,0,newSize);
		int [][] a12=subArray(arrA,0,newSize,newSize);
		int [][] a21=subArray(arrA,newSize,0,newSize);
		int [][] a22=subArray(arrA,newSize,newSize,newSize);
		
		int [][] b11=subArray(arrB,0,0,newSize);
		int [][] b12=subArray(arrB,0,newSize,newSize);
		int [][] b21=subArray(arrB,newSize,0,newSize);
		int [][] b22=subArray(arrB,newSize,newSize,newSize);
		
		int [][] M1=multiply(add(a11,a22,newSize),add(b11,b22,newSize),newSize);
		int [][] M2=multiply(add(a21,a22,newSize),b11,newSize);
		int [][] M3=multiply(a11,sub(b12,b22,newSize),newSize);
		int [][] M4=multiply(a22,sub(b21,b11,newSize),newSize);
		int [][] M5=multiply(add(a11,a12,newSize),b22,newSize);
		int [][] M6=multiply(sub(a21,a11,newSize),add(b11,b12,newSize),newSize);
		int [][] M7=multiply(sub(a12,a22,newSize),add(b21,b22,newSize),newSize);
		
		int [][] c11=add(sub(add(M1,M4,newSize),M5,newSize),M7,newSize);
		int [][] c12=add(M3,M5,newSize);
		int [][] c21=add(M2,M4,newSize);
		int [][] c22=add(add(sub(M1,M2,newSize),M3,newSize),M6,newSize);
		
		merge(c11,arrC,0,0,newSize);
		merge(c12,arrC,0,newSize,newSize);
		merge(c21,arrC,newSize,0,newSize);
		merge(c22,arrC,newSize,newSize,newSize);
		
		return arrC;
		
	}
	
	static int [][] sub(int [][] arrA, int [][] arrB, int size){
		
		int [][] arrC=new int[size][size];
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arrC[i][j]=arrA[i][j]-arrB[i][j];
			}
		}
		
		return arrC;
		
	}
	
	static int [][] add(int [][] arrA, int [][] arrB, int size){
		
		int [][] arrC=new int[size][size];
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arrC[i][j]=arrA[i][j]+arrB[i][j];
			}
		}
		
		return arrC;
		
	}

	static int [][] subArray(int [][] src, int row, int colum, int size){
		
		int [][] dest=new int[size][size];
		
		for(int dest_i=0,src_i=row; dest_i<size; dest_i++,src_i++) {
			for(int dest_j=0,src_j=colum; dest_j<size; dest_j++,src_j++) {
				dest[dest_i][dest_j]=src[src_i][src_j];
			}
		}
		
		return dest;
		
	}
	
	static void merge(int [][] src, int [][] dest, int row, int colum, int size) {
		
		for(int src_i=0,dest_i=row; src_i<size; src_i++,dest_i++) {
			for(int src_j=0,dest_j=colum; src_j<size; src_j++,dest_j++) {
				dest[dest_i][dest_j]=src[src_i][src_j];
			}
		}
		
	}
	
}
