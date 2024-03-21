package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dp1_9251 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char[] strA=br.readLine().toCharArray();
		char[] strB=br.readLine().toCharArray();
		br.close();		
		
		int lenA=strA.length;
		int lenB=strB.length;
		
		int [][] arrLen=new int[lenA+1][lenB+1];
		for(int i=1;i<=lenA;i++) {
			for(int j=1;j<=lenB;j++) {
				if(strA[i-1]==strB[j-1]) {
					arrLen[i][j]=arrLen[i-1][j-1]+1;
				}else {
					arrLen[i][j]=Math.max(arrLen[i-1][j], arrLen[i][j-1]);
				}
			}
		}
		
		System.out.println(arrLen[lenA][lenB]);
				
	}

}
