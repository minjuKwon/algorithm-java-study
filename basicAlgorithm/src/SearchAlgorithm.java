
public class SearchAlgorithm {

	public static void main(String[] args) {

		int[] data = { 1, 3, 5, 7, 9 };
		int N = data.length;
		int search = 3;
		int index = -1;
		boolean flag = false;

		int low = 0;
		int high = N - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (data[mid] == search) {
				flag = true;
				index = mid;
				break;
			}
			if (data[mid] < search)
				low = mid + 1;
			else
				high = mid - 1;
		}

		if (flag)
			System.out.println(search + " : " + (index + 1) + "번째에 위치합니다.");
		else
			System.out.println("찾지 못했습니다.");
	}

}
