import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculationTest {

	@Test
	void testFindMax() {
		int arr[] = { 10, 3, 2, 1, 4, 5, 9, 8, 6, 9 };
		assertEquals(10, Calculation.findMax(arr));
	}

	@Test
	void testCube() {
		assertEquals(8, Calculation.cube(2));
	}

	@Test
	void testReverseWord() {
		assertEquals("olleh", Calculation.reverseWord("hello"));
	}
}
