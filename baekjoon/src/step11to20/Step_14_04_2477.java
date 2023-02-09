package step11to20;
//https://yoon990.tistory.com/30
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_14_04_2477 {

	public static void main(String[] args) throws IOException {
		
		int [] rec= new int[6];
		
		int maxWidth=0;
		int maxHeight=0;
		
		int widthIdx=0;
		int heightIdx=0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int K=Integer.parseInt(br.readLine());
		
		for(int i=0;i<6;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int d=Integer.parseInt(st.nextToken());
			rec[i]=Integer.parseInt(st.nextToken());
			if(d==1||d==2) {
				if(rec[i]>maxWidth) {
					maxWidth=rec[i];
					widthIdx=i;
				}
			}else {
				if(rec[i]>maxHeight) {
					maxHeight=rec[i];
					heightIdx=i;
				}
			}
		}
		
		int minWidth=rec[(heightIdx+3)%6];
		int minHeight=rec[(widthIdx+3)%6];
		
		int count=K*((maxWidth*maxHeight)-(minWidth*minHeight));
		
		System.out.println(count);

	}

}
