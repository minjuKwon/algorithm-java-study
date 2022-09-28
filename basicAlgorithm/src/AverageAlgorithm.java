
public class AverageAlgorithm {

	public static void main(String[] args) {

		int[] data = { 90, 65, 78, 50, 95 };
		int sum = 0;
		int count = 0;

		for (int i = 0; i < data.length; i++) {
			if (data[i] >= 80 && data[i] <= 95) {
				sum += data[i];
				count++;
			}
		}

		double avg = sum / (double) count;

		System.out.println("80점 이상 95점 이하인 자료의 평균 : " + avg);

	}

}
