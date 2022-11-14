package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_06_03_10809_03 {

	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int[]arr=new int[26];
		for(int i=0;i<arr.length;i++)
			arr[i]=-1;
		
		String word=br.readLine();
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(arr[ch-'a']==-1)
				arr[ch-'a']=i;
		}
		for(int i:arr)
			System.out.print(i+" ");

	}

}
