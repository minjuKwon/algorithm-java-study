
public class MaxAlgorithm {

	public static void main(String[] args) {

		int max = Integer.MIN_VALUE;
		int[] numbers = { -2, -5, -3, -7, -1 };

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max)
				max = numbers[i];
		}

		System.out.println("최댓값 : " + max);
	}
}
