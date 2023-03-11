package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backtracking_2992 {
	
	static boolean[] visit;
	static String originNum;
	static int answer;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		originNum=br.readLine();
		
		visit=new boolean[originNum.length()];
		int length=originNum.length();
		answer=999999;
		
		findNum(length,"");
		
		if(answer==999999)
			System.out.println(0);
		else
			System.out.println(answer);

	}
	
	public static void findNum(int length,String str) {
		
		if(length==0) {
			int strNum=Integer.parseInt(str);
			int originInt=Integer.parseInt(originNum);
			if(strNum>originInt) {
				if(strNum<answer) {
					answer=strNum;
				}
			}
			return;
		}
		
		for(int i=0;i<originNum.length();i++) {
			if(!visit[i]) {
				visit[i]=true;
				findNum(length-1,str+originNum.charAt(i));
				visit[i]=false;
			}
		}
		
	}

}
