package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/113
public class Step_10_11_10814_03 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		StringBuilder [] arr=new StringBuilder[201];
		for(int i=0;i<arr.length;i++)
			arr[i]=new StringBuilder();
		
		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int age=Integer.parseInt(st.nextToken());
			String name=st.nextToken();
			arr[age].append(age+" "+name).append('\n');
		}
		
		StringBuilder sb=new StringBuilder();
		for (StringBuilder i : arr) {
			sb.append(i);
		}
		
		System.out.println(sb);
		
	}

}
