package step1to10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step_06_10_1316 {

	public static void main(String[] args) throws IOException {
		
		int count=0;
		boolean flag;
		int [] arr;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			String in=br.readLine();
			flag=true;
			arr=new int[26];
			for(int j=0;j<in.length();j++) {
				if(arr[in.charAt(j)-'a']==1) {
					if(in.charAt(j)!=in.charAt(j-1)) {
						flag=false;
					}
				}else
					arr[in.charAt(j)-'a']=1;
			}
			if(flag==true) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
