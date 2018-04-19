package org.tutorialspoint.arrays;

public class SimpleSort {

	public static int binarySearch(long[] a, long key) {
		int lower = 0;
		int upper = a.length - 1;
		while (lower <= upper) {
			int mid = (lower + upper) >> 1;
			if (a[mid] == key)
				return mid;
			else if (a[mid] < key)
				lower++;
			else
				upper--;
		}

		return -1;

	}

	public static void bubbleSort(long[] a) {
		for (int out = a.length - 1; out > 0; out--) {
			for (int in = 0; in < out; in++) {
				if (a[in] > a[in + 1]) {
					long temp = a[in];
					a[in] = a[in + 1];
					a[in + 1] = temp;
				}
			}
		}
	}

	public static void selectSort(long[] a) {
		for (int out = 0; out < a.length - 1; out++) {
			int min = out;
			for (int in = out + 1; in < a.length; in++) {
				if (a[min] > a[in])
					min = in;
				long temp = a[min];
				a[min] = a[out];
				a[out] = temp;
			}
		}
	}

}
