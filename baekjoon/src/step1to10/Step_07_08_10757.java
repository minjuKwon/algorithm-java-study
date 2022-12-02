package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//출처 : https://st-lab.tistory.com/199
public class Step_07_08_10757 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		String strA=st.nextToken();
		String strB=st.nextToken();
		
		int max=Math.max(strA.length(), strB.length());
		
		int [] arrA=new int[max+1];
		int [] arrB=new int[max+1];
		
		for(int i=strA.length()-1,idx=0;i>=0;i--,idx++) 
			arrA[idx]=strA.charAt(i)-'0';
		for(int i=strB.length()-1,idx=0;i>=0;i--,idx++)
			arrB[idx]=strB.charAt(i)-'0';
		
		for(int i=0;i<max;i++) {
			int value=arrA[i]+arrB[i];
			arrA[i]=value%10;
			arrA[i+1]+=(value/10);
		}
		
		StringBuilder sb=new StringBuilder();
		if(arrA[max]!=0)
			sb.append(arrA[max]);
		for(int i=max-1;i>=0;i--)
			sb.append(arrA[i]);
		System.out.println(sb);

	}

}
