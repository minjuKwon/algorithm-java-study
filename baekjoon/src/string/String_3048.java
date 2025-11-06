package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class String_3048 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		String s1=br.readLine();
		String s2=br.readLine();
		
		int T=Integer.parseInt(br.readLine());
		
		br.close();
		
		ArrayList<Ant> list =new ArrayList<>();
		
		for(int i=s1.length()-1;i>=0;i--) {
			list.add(new Ant(s1.charAt(i),1));
		}
		
		for(int i=0;i<s2.length();i++) {
			list.add(new Ant(s2.charAt(i),2));
		}
		
		while(T-->0) {
			ArrayList<Integer> swapIndex = new ArrayList<>();
			
			for(int i=0;i<list.size()-1;i++) {
				Ant ant1= list.get(i);
				Ant ant2= list.get(i+1);
				if (ant1.direction == 1 && ant2.direction == 2) {
                    swapIndex.add(i);
                    i++; 
                }
			}
			
			for (int idx : swapIndex) {
                Ant temp = list.get(idx);
                list.set(idx, list.get(idx + 1));
                list.set(idx + 1, temp);
            }
		}
		
		StringBuilder sb=new StringBuilder();
		for(Ant a:list) {
			sb.append(a.ch);
		}
		
		System.out.println(sb.toString());

	}

	private static class Ant{
		char ch;
		int direction;
		public Ant(char ch, int direction) {
			this.ch=ch;
			this.direction=direction;
		}
	}
	
}