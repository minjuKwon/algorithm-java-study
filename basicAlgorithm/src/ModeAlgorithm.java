
public class ModeAlgorithm {

	public static void main(String[] args) {

		int[] scores = { 1, 3, 4, 3, 5 };
		int[] indexes = new int[5 + 1];
		int max = Integer.MIN_VALUE;
		int mode = 0;

		for (int i = 0; i < scores.length; i++)
			indexes[scores[i]]++;
		for (int i = 0; i < indexes.length; i++) {
			if (indexes[i] > max) {
				max = indexes[i];
				mode = i;
			}
		}

		System.out.println("최빈 값 : " + mode + "(" + max + "번)");

	}

}
