
public class Statistics {
	private int[] arr = new int[100];
	private int n;

	public Statistics() {
		arr[n] = 0;
		n++;
	}

	public void add(int number) {
		arr[n] = number;
		n++;
	}

	public void remove(int number) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == number) {
				for (int j = i; j < n - 1; j++) {
					arr[j] = arr[j + 1];
				}
				n--;
				break;
			}
		}
	}

	public void removeAll(int number) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == number) {
				for (int j = i; j < n - 1; j++) {
					arr[j] = arr[j + 1];
				}
				n--;
			}
		}
	}

	public int sum() {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public double getAverage() {
		return sum() / n;
	}

	public double getStandardDeviation() {
		int sum = 0;
		double aver = getAverage();
		for (int i = 0; i < n; i++) {
			sum += Math.abs(aver - arr[i]);
		}
		return sum / n;
	}

	public int maxOccurances() {
		int max = 0;
		int times = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > times) {
				max = i;
				times = count;
			}
		}
		return arr[max];
	}
}
