package review4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Tree_5639_02 {
	
	static ArrayList<Integer> list=new ArrayList<>();
	static StringBuilder sb=new StringBuilder();

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String input=br.readLine();
			if(input==null||input.equals("")) break;
			list.add(Integer.parseInt(input));
		}
		br.close();
		
		getPost(0,list.size()-1);
		
		System.out.println(sb);

	}
	
	static void getPost(int start, int end) {
		if(start>end) return;
		
		int p=start+1;
		while(p<=end&&list.get(p)<list.get(start)) {
			p++;
		}
		
		getPost(start+1,p-1);
		getPost(p,end);
		sb.append(list.get(start)).append('\n');
	}

}
