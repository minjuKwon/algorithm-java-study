package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_18_03_1904 {
	
	static int[] tiles=new int[1000001];

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		br.close();
		
		tiles[0]=0; tiles[1]=1; tiles[2]=2;
		for(int i=3;i<tiles.length;i++) {
			tiles[i]=-1;
		}
		
		System.out.println(binarySequence(N));

	}
	
	static int binarySequence(int n) {
		if(tiles[n]==-1) {
			tiles[n]=(binarySequence(n-1)+binarySequence(n-2))%15746;
		}
		return tiles[n];
	}

}
