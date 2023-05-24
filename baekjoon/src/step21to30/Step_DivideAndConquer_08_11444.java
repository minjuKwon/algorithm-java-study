package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://st-lab.tistory.com/252
public class Step_DivideAndConquer_08_11444 {
	
	final static int VALUE=1000000007;
	static long [][] arrOrigin= {{1,1},{1,0}};

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		long n=Long.parseLong(br.readLine());
		
		long [][] arrA= {{1,1},{1,0}};
		
		System.out.println(pow(arrA,n-1)[0][0]);

	}
	
	static long [][] pow(long [][] arr, long exponent){
		
		if(exponent==1||exponent==0) {
			return arr;
		}
		
		long [][] arrRecency=pow(arr,exponent/2);
		
		arrRecency=multiply(arrRecency, arrRecency);
		
		if(exponent%2==1) {
			arrRecency=multiply(arrRecency, arrOrigin);
		}
		
		return arrRecency;
		
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
