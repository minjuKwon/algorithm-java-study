package step11to20;
//https://st-lab.tistory.com/96
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Step_11_06_11729 {

	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		
		bw.write((int)(Math.pow(2, N)-1)+"\n");
		
		hanoi(N,1,2,3);
		
		bw.flush();
		bw.close();
		br.close();

	}
	
	public static void hanoi(int N,int start, int mid, int to) throws IOException {
		
		if(N==1) {
			bw.write(start+" "+to+"\n");
			return;
		}
		
		hanoi(N-1,start,to,mid);
		
		bw.write(start+" "+to+"\n");
		
		hanoi(N-1,mid,start,to);
			
	}	

}
