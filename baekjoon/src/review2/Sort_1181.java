package review2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sort_1181 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		String [] arr=new String [N];
		for(int i=0;i<N;i++) {
			arr[i]=br.readLine();
		}
		br.close();
		
		Arrays.sort(arr, (e1, e2)->{
			if(e1.length()==e2.length()) {
				return e1.compareTo(e2);
			}else {
				return e1.length()-e2.length();
			}
		});
		
		StringBuilder sb=new StringBuilder();
		sb.append(arr[0]).append('\n');
				
		for(int i=1;i<N;i++) {
			if(!arr[i].equals(arr[i-1])) {
				sb.append(arr[i]).append('\n');
			}
		}
		
		System.out.println(sb);

	}

}
