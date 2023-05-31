package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/277
public class Step_BinarySearch_05_2110 {

	static int [] arrHouse;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int C=Integer.parseInt(st.nextToken());
		
		arrHouse=new int[N];
		for(int i=0;i<N;i++) {
			arrHouse[i]=Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		Arrays.sort(arrHouse);
		
		int low=1;
		int high=arrHouse[N-1]-arrHouse[0]+1;
		
		while(low<high) {
			int mid=(low+high)/2;
			if(install(mid)<C) {
				high=mid;
			}else {
				low=mid+1;
			}
		}
		
		System.out.println(low-1);

	}
	
	static int install(int distance) {
		
		int count=1;
		int lastLocation=arrHouse[0];
		
		for(int i=1;i<arrHouse.length;i++) {
			int location=arrHouse[i];
			if(location-lastLocation>=distance) {
				count++;
				lastLocation=location;
			}
		}
		
		return count;
		
	}

}
