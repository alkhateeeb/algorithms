package com.sort;

public class InsertionSort {

	public static <T> void sort(T[] a) {
		// 66, 33, 50, 44,1, 22, 3, 12,2
		int iteratedcount = 0;	
		int n = a.length;
		for (int index = 0; index < n; index++) {
			for (int index2 = index; index2 > 0; index2--) {
				iteratedcount++;
				if (less(a[index2 - 1], a[index2])) {
					break;
				}
				exchnage(a, index2, index2 - 1);
			}
		}
		System.out.println(iteratedcount);
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
