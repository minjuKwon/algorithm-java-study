package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_1100 {

	public static void main(String[] args) throws IOException {
		
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   boolean isWhite =true;
	   int count=0;
	   
	   for(int i=0;i<8;i++) {
		   String input=br.readLine();
		   char [] arr= input.toCharArray();
		   for(int j=0;j<8;j++) {
			   if(arr[j]=='F'&&isWhite) count++;
			   isWhite= !isWhite;
		   }
		   isWhite= !isWhite;
	   }
	   
	   System.out.println(count);
	   
	}

}
