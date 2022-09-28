
public class MinAlgorithm {

	public static void main(String[] args) {

		int min = Integer.MAX_VALUE;
		int[] numbers = { 0b0010, 0B0101, 0b0011, 0B0111, 0b0000_0001 };// { 2, 5, 3, 7, 1 }

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min && numbers[i] % 2 == 0)
				min = numbers[i];
		}

		System.out.println("짝수 최솟값 : " + min);
	}

}
