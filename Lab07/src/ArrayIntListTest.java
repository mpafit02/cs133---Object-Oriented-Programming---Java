import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayIntListTest {

	@Test
	void testAddInt() {
		ArrayIntList list = new ArrayIntList();
		list.add(42);
		list.add(-3);
		list.add(17);
		list.add(99);
		assertTrue(list.contains(-3));
		assertFalse("Is empty!", list.isEmpty());
		assertEquals(-3, list.get(1));
		assertEquals(17, list.get(2));
		assertEquals(99, list.get(3));
	}

	@Test
	void testSize() {
		ArrayIntList list = new ArrayIntList();
		assertEquals(0, list.size());
		list.add(42);
		assertEquals(1, list.size());
		list.add(-3);
		assertEquals(2, list.size());
		list.add(17);
		assertEquals(3, list.size());
		list.add(99);
		assertEquals(4, list.size());
		assertEquals("second attempt", 4, list.size()); // make sure I can get it a second time
	}

	@Test
	void testIndexOf() {
		// fail("Not yet implemented");
	}

}
