package com.sort;

public class ShellSort {

	public static <T> void sort(T[] a) {
		// 66, 50, 33, 2, 22, 44, 1, 3, 12
		int n = a.length;
		int gab = n / 2;
		int count = 0;
		while (gab >= 1) {
			for (int index = 0; index < n - gab; index++) {
				for (int index2 = index; index2 < n - gab; index2 += gab) {
					if (!less(a[index2], a[index2 + gab])) {
						count++;
						exchnage(a, index2, index2 + gab);
					}

				}
			}
			gab = gab / 2;
		}
		System.out.println(count);

	}

	private static <T> void exchnage(T[] a, int i, int j) {
		// Swap numbers
		T t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	private static <T> boolean less(T v, T w) {
		Comparable<T> compareableV = (Comparable<T>) v;
		return compareableV.compareTo(w) < 0;
	}

	public static boolean isSorted() {
		return false;
	}

	public static <T> void print(T[] a) {
		for (T t : a) {
			System.out.print(t.toString() + " ");
		}
		System.out.println();
	}

}
