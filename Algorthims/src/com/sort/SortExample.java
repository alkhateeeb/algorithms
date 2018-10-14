package com.sort;

public class SortExample<T> {

	public void sort(T[] a) {

	}

	private void exchnage(T[] a, int i, int j) {
		// Swap numbers
		T t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	private  boolean less(T v, T w) {
		Comparable<T> compareableV = (Comparable<T>) v;
		return compareableV.compareTo(w) < 0;
	}

	public static boolean isSorted() {
		return false;
	}

}
