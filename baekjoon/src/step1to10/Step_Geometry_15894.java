package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_Geometry_15894 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Long n=Long.parseLong(br.readLine());
		br.close();
		
		System.out.println(n*4);

	}

}
