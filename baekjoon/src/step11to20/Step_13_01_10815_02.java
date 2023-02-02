package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Step_13_01_10815_02 {
	
	static int [] arrN;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		arrN=new int[N];
		StringTokenizer stN=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
			arrN[i]=Integer.parseInt(stN.nextToken());
				
		Arrays.sort(arrN);

		int M=Integer.parseInt(br.readLine());
		StringTokenizer stM=new StringTokenizer(br.readLine());
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<M;i++) {
			int result=binarySort(Integer.parseInt(stM.nextToken()));
				sb.append(result).append(' ');
		}

		System.out.println(sb);
		
	}
	
	static int binarySort(int target) {
		int low=0;
		int high=arrN.length-1;
		int mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			 if(arrN[mid]==target) 
				return 1;
			 else if(arrN[mid]<target) 
				low=mid+1;
			else 
				high=mid-1;
		}
		return 0;
	}

}
