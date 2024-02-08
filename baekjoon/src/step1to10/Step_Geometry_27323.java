package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_Geometry_27323 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int A=Integer.parseInt(br.readLine());
		int B=Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println(A*B);

	}

}
