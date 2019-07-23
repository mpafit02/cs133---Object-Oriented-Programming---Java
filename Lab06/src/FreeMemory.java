public class FreeMemory {
	public static void main(String[] arg) {
		int[][] table = new int[3][];
		int i;
		System.out.println("The maximum : " + Runtime.getRuntime().maxMemory());
		System.out.println("The total : " + Runtime.getRuntime().totalMemory());
		System.out.println("Free : " + Runtime.getRuntime().freeMemory());
		long free = Runtime.getRuntime().freeMemory();
		System.out.println();
		for (i = 0; i < 3; i++) {
			table[i] = new int[400000];
			System.out.println("i = " + i + ", free : " + Runtime.getRuntime().freeMemory());
			System.out.println(free - Runtime.getRuntime().freeMemory());
		}
		System.gc();
		System.out.println();
		System.out.println("After deallocation, free : " + Runtime.getRuntime().freeMemory());
		System.out.println();
		for (i = 0; i < 3; i++) {
			table[i] = null;
			System.gc(); //Run Garbage Collector
			System.out.println("i = " + i + ", free : " + Runtime.getRuntime().freeMemory());
		}
	}
}