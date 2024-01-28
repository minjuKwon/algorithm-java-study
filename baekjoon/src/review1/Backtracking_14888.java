package review1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backtracking_14888 {

	static int MAX=Integer.MIN_VALUE;
	static int MIN=Integer.MAX_VALUE;
	
	static int [] nums;
	static int [] operators=new int[4];
	
	static int N;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		
		nums=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			nums[i]=Integer.parseInt(st.nextToken());
		}
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<4;i++) {
			operators[i]=Integer.parseInt(st.nextToken());
		}
		
		br.close();
		
		calculation(nums[0],1);
		
		System.out.println(MAX+"\n"+MIN);
		
	}
	
	static void calculation(int num, int depth) {
		
		if(depth==N) {
			if(num>MAX) {
				MAX=num;
			}
			
			if(num<MIN) {
				MIN=num;
			}
			return;
		}
		
		for(int i=0;i<4;i++) {
			if(operators[i]>0) {
				operators[i]--;
				switch(i) {
				case 0:
					calculation(num+nums[depth], depth+1); break;
				case 1:
					calculation(num-nums[depth], depth+1); break;
				case 2:
					calculation(num*nums[depth], depth+1); break;
				case 3:
					calculation(num/nums[depth], depth+1); break;
				}
				operators[i]++;
			}
		}
		
	}

}
