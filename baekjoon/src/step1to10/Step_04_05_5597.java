package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_04_05_5597 {

	public static void main(String[] args) throws IOException{
		
		int [] students=new int[31];
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int s;
		for(int i=1;i<29;i++) {
			s=Integer.parseInt(br.readLine());
			students[s]=1;
		}
		for(int i=1;i<students.length;i++) {
			if(students[i]!=1) {
				System.out.println(i);
			}
		}
		

	}

}
