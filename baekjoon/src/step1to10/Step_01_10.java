package step1to10;

import java.util.Scanner;

public class Step_01_10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int king=sc.nextInt();
		int queen=sc.nextInt();
		int rook=sc.nextInt();
		int bishop=sc.nextInt();
		int knight=sc.nextInt();
		int pawn=sc.nextInt();
		
		sc.close();
		
		king=1-king;
		queen=1-queen;
		rook=2-rook;
		bishop=2-bishop;
		knight=2-knight;
		pawn=8-pawn;
		
		System.out.print(king+" "+queen+" "+rook+" "+bishop+" "+knight+" "+pawn);
		
	}

}
