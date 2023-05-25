package step21to30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//https://st-lab.tistory.com/255
public class Step_DivideAndConquer_09_6549 {

	static int [] histogram;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int n;
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		
		while(true) {
			
			st=new StringTokenizer(br.readLine());
			
			n=Integer.parseInt(st.nextToken());
			
			if(n==0) {
				break;
			}
			
			histogram=new int[n];
			
			for(int i=0;i<n;i++) {
				histogram[i]=Integer.parseInt(st.nextToken());
			}
			
			sb.append(getArea(0,n-1)).append('\n');
		
		}
		
		System.out.println(sb);

	}
	
	static long getArea(int low, int high) {
		
		if(low==high) {
			return histogram[low];
		}
		
		int mid=(low+high)/2;
		
		long areaL=getArea(low,mid);
		long areaR=getArea(mid+1,high);
		
		long max=Math.max(areaL, areaR);
		
		max=Math.max(max, getMidArea(low,high,mid));
		
		return max;
		
	}
	
	static long getMidArea(int low, int high, int mid) {
		
		int toLeft=mid;
		int toRight=mid;
		long height=histogram[mid];
		long maxArea=height;
		
		while(low<toLeft && toRight<high) {
			
			if(histogram[toLeft-1]<histogram[toRight+1]) {
				toRight++;
				height=Math.min(height, histogram[toRight]);
			}else {
				toLeft--;
				height=Math.min(height, histogram[toLeft]);
			}
			
			maxArea=Math.max(maxArea, height*(toRight-toLeft+1));
			
		}
		
		while(toRight<high) {
			toRight++;
			height=Math.min(height, histogram[toRight]);
			maxArea=Math.max(maxArea, height*(toRight-toLeft+1));
		}
		
		while(low<toLeft) {
			toLeft--;
			height=Math.min(height, histogram[toLeft]);
			maxArea=Math.max(maxArea, height*(toRight-toLeft+1));
		}
		
		return maxArea;
		
	}

}
