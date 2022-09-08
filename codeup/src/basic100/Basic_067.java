package basic100;

import java.util.Scanner;

public class Basic_067 {

	public static void main(String[] args) {
		
		String score;
		
		Scanner scanner=new Scanner(System.in);
		score=scanner.next();
		scanner.close();
		
		switch(score) {
		case "A":
			System.out.println("best!!!");
			break;
		case "B":
			System.out.println("good!!");
			break;
		case "C":
			System.out.println("run!");
			break;
		case "D":
			System.out.println("slowly~");
			break;
		default:
				System.out.println("what?");
		}

	}

}
