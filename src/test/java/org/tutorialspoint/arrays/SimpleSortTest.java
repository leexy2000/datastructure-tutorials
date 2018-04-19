package org.tutorialspoint.arrays;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SimpleSortTest {
	
	private long[] a;
	private long[] b;

	@Before
	public void setUp() throws Exception {
		a = new long[] {1,2,3,4,5,6,7,8,9,10};
		b = new long[] {10,9,8,7,6,5,4,3,2,1};
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBinarySearch() {
		int index = SimpleSort.binarySearch(a, 0);
		System.out.println(Arrays.toString(a));
		assertTrue(index == -1);
	}

	@Test
	public void testBubbleSort() {
		SimpleSort.bubbleSort(b);
		System.out.println(Arrays.toString(b));
		assertTrue(b[1]<b[2]);
	}

	@Test
	public void testSelectSort() {
		SimpleSort.selectSort(b);
		System.out.println(Arrays.toString(b));
		assertTrue(b[1]<b[2]);
	}

}
