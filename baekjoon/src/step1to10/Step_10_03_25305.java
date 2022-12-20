package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Step_10_03_25305 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer personSt=new StringTokenizer(br.readLine());
		
		Integer [] student=new Integer[Integer.parseInt(personSt.nextToken())];
		int winner=Integer.parseInt(personSt.nextToken());
		
		StringTokenizer scoreSt=new StringTokenizer(br.readLine());
		for(int i=0;i<student.length;i++) {
			student[i]=Integer.parseInt(scoreSt.nextToken());
		}
		
		Arrays.sort(student,Collections.reverseOrder());
		
		System.out.println(student[winner-1]);
		//System.out.println(student[student.length-winner]);
	}

}
