
public class TestStatisticsCalculation {

	public static void main(String[] args) {
		StatisticsCalculation sc = new StatisticsCalculation(10);
		sc.add(14);
		sc.add(3);
		sc.add(21);
		sc.add(11);
		sc.add(6);
		sc.add(9);
		sc.add(10);
		sc.add(3);
		sc.add(1);
		sc.add(7);

		System.out.println(sc.toString());
		System.out.println(sc.maxOccurances());
		sc.remove(1);
		System.out.println(sc.toString());
		sc.removeAll(3);
		System.out.println(sc.toString());
		sc.add(8);
		System.out.println(sc.toString());
		System.out.println(sc.average());
		System.out.println(sc.getStandardDeviation());
		System.out.println(sc.max());
		System.out.println(sc.min());
		sc.removeAll();
		System.out.println(sc.toString());

	}

}
