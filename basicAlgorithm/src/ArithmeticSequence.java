
public class ArithmeticSequence {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				sum += i;
				System.out.print(i + " ");
			}
		}
		System.out.println("\n1부터 20까지지의 홀수의 합 : " + sum);

	}

}
