import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAlgorithm {

	public static class Record {

		private final String name;
		private final int quantity;

		public Record(String name, int quantity) {
			this.name = name;
			this.quantity = quantity;
		}

		public String getName() {
			return name;
		}

		public int getQuantity() {
			return quantity;
		}

	}

	public static List<Record> getAll() {
		return Arrays.asList(new Record("RADIO", 3), new Record("TV", 1), new Record("RADIO", 2), new Record("DVD", 4));
	}

	public static void printData(String message, List<Record> data) {
		System.out.println(message);
		for (Record item : data)
			System.out.println(String.format("%5s - %d", item.getName(), item.getQuantity()));
	}

	public static void main(String[] args) {

		List<Record> records = getAll();
		List<Record> groups = new ArrayList<Record>();
		int N = records.size();

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (records.get(i).getName().compareTo(records.get(j).getName()) > 0) {
					Record t = records.get(i);
					records.set(i, records.get(j));
					records.set(j, t);
				}
			}
		}

		int subtotal = 0;
		for (int i = 0; i < N; i++) {
			subtotal += records.get(i).getQuantity();
			if ((i + 1) == N || (records.get(i).getName() != records.get(i + 1).getName())) {
				Record r = new Record(records.get(i).getName(), subtotal);
				groups.add(r);
				subtotal = 0;
			}
		}

		printData("원본 데이터 : ", records);
		printData("이름으로 그룹화된 데이터  : ", groups);

	}

}
