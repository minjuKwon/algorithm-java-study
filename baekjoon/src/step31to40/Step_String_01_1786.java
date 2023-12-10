package step31to40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Step_String_01_1786 {
	
	static String T,P;
	static int [] table;
	static List<Integer> answers=new ArrayList<>();

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		T=br.readLine();
		P=br.readLine();
		
		br.close();
		
		table=new int[T.length()];

		KMP();
		
		StringBuilder sb=new StringBuilder();
		
		sb.append(answers.size()).append('\n');
		
		for(int answer:answers) {
			sb.append(answer).append(' ');
		}
		
		System.out.println(sb);
		
	}
	
	static void KMP() {
		
		makeTable();
		
		int tLen=T.length();
		int pLen=P.length();
		
		int p=0;
		
		for(int t=0;t<tLen;t++) {
			
			while(p>0&&T.charAt(t)!=P.charAt(p)) {
				p=table[p-1];
			}
			
			if(T.charAt(t)==P.charAt(p)) {
				if(p==pLen-1) {
					answers.add(t-p+1);
					p=table[p];
				}else {
					p++;
				}
			}
			
		}
		
	}
	
	static void makeTable() {
		
		int pLen=P.length();
		int idx=0;
		
		for(int p=1;p<pLen;p++) {
			
			while(idx>0&&P.charAt(p)!=P.charAt(idx)) {
				idx=table[idx-1];
			}
			
			if(P.charAt(p)==P.charAt(idx)) {
				idx++;
				table[p]=idx;
			}
			
		}
		
	}

}
