package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_06_03_10809 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String word=br.readLine();
		char[] arr=word.toCharArray();
		
		for(char i='a';i<='z';i++) {
			boolean is=false;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==i) {
					is=true;
					System.out.print(j+" ");
					break;
				}
			}
			if(is==false)
				System.out.print(-1+" ");
		}

	}

}
