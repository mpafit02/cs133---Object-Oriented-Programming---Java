
public class StatisticsCalculation {

	private int[] numbers;
	private int n;

	public StatisticsCalculation(int x) {
		numbers = new int[x];
		n = 0;
	}

	public void add(int x) {
		numbers[n] = x;
		n++;
	}

	public void remove(int x) {
		boolean found = false;
		int i = 0;
		while (!found) {
			if (numbers[i] == x) {
				for (int j = i; j < n - 1; j++) {
					numbers[j] = numbers[j + 1];
				}
				numbers[n - 1] = 0;
				n--;
				found = true;
			} else {
				i++;
			}
		}
	}

	public void removeAll(int x) {
		for (int i = 0; i < n; i++) {
			if (numbers[i] == x) {
				for (int j = i; j < n - 1; j++) {
					numbers[j] = numbers[j + 1];
				}
				numbers[n - 1] = 0;
				n--;
			}
		}
	}

	public void removeAll() {
		for (int i = 0; i < n; i++) {
			numbers[i] = 0;
		}
		n = 0;
	}

	public int sum() {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += numbers[i];
		}
		return sum;
	}

	public double average() {
		return sum() / n;
	}

	public double getStandardDeviation() {
		double squareSum = 0;
		for (int i = 0; i < n; i++) {
			squareSum += Math.pow(numbers[i], 2);
		}
		return Math.sqrt(squareSum / n);
	}

	public int max() {
		int max = numbers[0];
		for (int i = 0; i < n; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}

	public int min() {
		int min = numbers[0];
		for (int i = 0; i < n; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < numbers.length; i++) {
			s += numbers[i] + " ";
		}
		return s;
	}

	public int maxOccurances() {
		int count, maxCount = 0;
		int num = numbers[0];
		for (int i = 0; i < n; i++) {
			count = 0;
			for (int j = 0; j < n; j++) {
				if (numbers[i] == numbers[j]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				num = numbers[i];
			}
		}
		return num;
	}
}
