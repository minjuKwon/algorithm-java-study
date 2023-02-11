package step11to20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step_14_07_1004 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<T;i++) {
			StringTokenizer stPoint=new StringTokenizer(br.readLine());
			int x1=Integer.parseInt(stPoint.nextToken());
			int y1=Integer.parseInt(stPoint.nextToken());
			int x2=Integer.parseInt(stPoint.nextToken());
			int y2=Integer.parseInt(stPoint.nextToken());
			
			int n=Integer.parseInt(br.readLine());
			int count=0;
			for(int j=0;j<n;j++) {
				 StringTokenizer stPlanet=new StringTokenizer(br.readLine());
				 int cx=Integer.parseInt(stPlanet.nextToken());
				 int cy=Integer.parseInt(stPlanet.nextToken());
				 int r=Integer.parseInt(stPlanet.nextToken());
				 
				 int move=0;
				 int point1=(int)(Math.pow(x1-cx, 2)+Math.pow(y1-cy, 2));
				 int point2=(int)(Math.pow(x2-cx, 2)+Math.pow(y2-cy, 2));
				 if(point1<Math.pow(r, 2)&&point2>Math.pow(r, 2)) {
					move= 1;
				 }else if(point1>Math.pow(r, 2)&&point2<Math.pow(r, 2)) {
					move= 1;
				 }else {
					move= 0;
				 }
				 count+=move;
			}
			
			sb.append(count).append('\n');
			
		}
		
		br.close();
		
		System.out.println(sb);
		
	}

}
