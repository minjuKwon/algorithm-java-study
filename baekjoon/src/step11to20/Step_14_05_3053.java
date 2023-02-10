package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_14_05_3053 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int R=Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println(R*R*Math.PI);
		System.out.println(2*R*R);

	}

}
