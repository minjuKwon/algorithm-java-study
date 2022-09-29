
public class NearAlgorithm {

	public static void main(String[] args) {

		int min = Integer.MAX_VALUE;
		int[] numbers = { 10, 20, 30, 27, 17 };
		int target = 25;
		int near = 0;

		for (int i = 0; i < numbers.length; i++) {
			int abs = Abs(numbers[i] - target);
			if (abs < min) {
				min = abs;
				near = numbers[i];
			}
		}
		
		System.out.println(target + " 가장 가까운 값 : " + near + "(차이 : " + min + ")");

	}

	public static int Abs(int number) {
		return (number < 0) ? -number : number;
	}

}
