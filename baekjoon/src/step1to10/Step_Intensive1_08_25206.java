package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_Intensive1_08_25206 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
		
		String [] ratings= {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" };
		double [] scores= {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
		
		int times=20;
		StringTokenizer st;
		double majorSum=0, gradeSum=0;
		
		while(times-->0) {
			st=new StringTokenizer(br.readLine());
			st.nextToken();
			double grade=Double.parseDouble(st.nextToken());
			String rating=st.nextToken();
			for(int i=0; i<ratings.length;i++) {
				if(ratings[i].equals(rating)) {
					majorSum+=(grade*scores[i]);
					gradeSum+=grade;
				}
			}
		}
		
		br.close();
		
		System.out.println(majorSum/gradeSum);

	}

}
