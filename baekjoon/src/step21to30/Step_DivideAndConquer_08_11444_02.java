package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://st-lab.tistory.com/252
public class Step_DivideAndConquer_08_11444_02 {
	
	final static int VALUE=1000000007;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		long n=Long.parseLong(br.readLine());
		
		if(n==1||n==0) {
			System.out.println(n);
			return;
		}
		
		n--;
		
		long [][] arrOrigin= {{1,1},{1,0}};
		long [][] arrA= {{1,0},{0,1}};
		
		while(n>0) {
			
			if(n%2==1) {
				arrA=multiply(arrA,arrOrigin);
			}
			
			arrOrigin=multiply(arrOrigin,arrOrigin);
			
			n/=2;
			
		}
		
		System.out.println(arrA[0][0]);

	}
	
	static long [][] multiply(long [][] arr1, long [][] arr2){
		
		long [][] arrRecency=new long[2][2];
		
		arrRecency[0][0]=(arr1[0][0]*arr2[0][0]+arr1[0][1]*arr2[1][0])%VALUE;
		arrRecency[0][1]=(arr1[0][0]*arr2[0][1]+arr1[0][1]*arr2[1][1])%VALUE;
		arrRecency[1][0]=(arr1[1][0]*arr2[0][0]+arr1[1][1]*arr2[1][0])%VALUE;
		arrRecency[1][1]=(arr1[1][0]*arr2[0][1]+arr1[1][1]*arr2[1][1])%VALUE;
		
		return arrRecency;
		
	}

}
