package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Step_13_06_1269_03 {

		public static void main(String[] args)throws IOException{
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer stN=new StringTokenizer(br.readLine());
			
			int numA=Integer.parseInt(stN.nextToken());
			int numB=Integer.parseInt(stN.nextToken());
			
			HashSet<Integer> setA=new HashSet<>();
			
			StringTokenizer stA=new StringTokenizer(br.readLine());
			for(int i=0;i<numA;i++)
				setA.add(Integer.parseInt(stA.nextToken()));
			
			StringTokenizer stB=new StringTokenizer(br.readLine());
			int count=0;
			for(int i=0;i<numB;i++) {
				int num=Integer.parseInt(stB.nextToken());
				if(setA.contains(num))
					count++;
			}
				
			int size=numA+numB-(count*2);
			System.out.println(size);

		}

}
