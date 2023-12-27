package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Intensive2_2108 {

	public static void main(String[] args) throws IOException{
		
		int [] arr=new int[8001];
		int min=4001;
		int max=-4001;
		int sum=0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			int num=Integer.parseInt(br.readLine());
			arr[num+4000]++;
			sum+=num;
			if(num>max) max=num;
			if(num<min) min=num;
		}
		
		br.close();
		
		int count=0;
		int median=4001;
		int mode=4001;
		int modeMax=0;
		boolean isDuplication=false;
		
		for(int i=min+4000;i<=max+4000;i++) {
			if(arr[i]>0) {
				
				if(count<(N+1)/2) {
					median=i-4000;
					count+=arr[i];
				}
				
				if(arr[i]>modeMax) {
					modeMax=arr[i];
					mode=i-4000;
					isDuplication=true;
				}else if(arr[i]==modeMax&&isDuplication) {
					mode=i-4000;
					isDuplication=false;
				}
				
			}
		}
		
		System.out.println((int)Math.round((double)sum/N)+"\n"+median+"\n"+mode+"\n"+(max-min));

	}

}
