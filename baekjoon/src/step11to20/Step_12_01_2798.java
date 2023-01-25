package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_12_01_2798 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int [] arr=new int[N];
		StringTokenizer stArr=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
			arr[i]=Integer.parseInt(stArr.nextToken());
		
		int answer=0;
		int  nearNum=0;
		for(int i=0;i<N-2;i++) {
			for(int j=i+1;j<N-1;j++) {
				for(int k=j+1;k<N;k++) {
					answer=0;
					answer+=arr[i];
					answer+=arr[j];
					answer+=arr[k];
					if(M>=answer) {
						if(answer>nearNum) {
							nearNum=answer;
						}
					}
				}
			}
		}
		
		System.out.println(nearNum);

	}

}
