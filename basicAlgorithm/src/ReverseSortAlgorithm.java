import java.util.Arrays;
import java.util.Collections;

public class ReverseSortAlgorithm {

	public static void main(String[] args) {
		
		Integer[] scores= {88,55,33,100,90,91,76,45};

		System.out.println("정렬 전");
		for(int i: scores)
			System.out.print(i+" ");
		System.out.println();
		
		Arrays.sort(scores,Collections.reverseOrder());
		
		System.out.println("정렬 후");
		for(int i:scores)
			System.out.print(i+" ");
		System.out.println();
		
	}

}
