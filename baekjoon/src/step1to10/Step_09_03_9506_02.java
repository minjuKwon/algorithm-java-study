package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Step_09_03_9506_02 {

	public static void main(String[] args) throws IOException{
		
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder answer=new StringBuilder();
		int num=Integer.parseInt(br.readLine());
		
		while(num!=-1) {
			int sum=0;
			ArrayList<Integer> list=new ArrayList<>();
			
			for(int i=1;i<num;i++) {
				if(num%i==0) {
					sum+=i;
					list.add(i);
				}
			}
			
			answer.append(num);
			if(sum==num) {
				Collections.sort(list);
				int size=list.size();
				answer.append(" = ");
				for(int i=0;i<size-1;i++) {
					answer.append(list.get(i)).append(" + ");
				}
				answer.append(list.get(size-1)).append('\n');
			}else {
				answer.append(" is NOT perfect.").append('\n');
			}
			num=Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		System.out.println(answer);

	}

}
