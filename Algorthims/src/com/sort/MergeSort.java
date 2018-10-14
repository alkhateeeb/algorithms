package com.sort;

public class MergeSort {

	private static Object[] aux;
	private static int count;

	public static <T> void sort(T[] a) {
		// 66, 50, 33, 2, 22, 44, 1, 3, 12
		int n = a.length - 1;
		aux = new Object[a.length];
		sort(a, 0, n);
		System.out.println("Total :: " + count);
	}

	private static <T> void sort(T[] a, int min, int high) {
		if (high <= min) {
			return;
		} else {
			int mid = min + (high - min) / 2;
			sort(a, min, mid);
			sort(a, mid + 1, high);
			merge(a, min, mid, high);
		}
	}

	private static <T> void merge(T[] a, int min, int mid, int high) {
		System.out.println("Min :: " + min + " :: Mid :: " + mid + " :: High :: " + high);
		int firstInvistigatedIndex = min;
		int midInvistigatedIndex = mid + 1;
		for (int index = min; index <= high; index++) {
			aux[index] = a[index];
		}
		for (int index = min; index <= high; index++) {

			if (firstInvistigatedIndex > mid) {
				a[index] = (T) aux[midInvistigatedIndex++];
			} else if (midInvistigatedIndex > high) {
				a[index] = (T) aux[firstInvistigatedIndex++];
			} else if (less(aux[midInvistigatedIndex], aux[firstInvistigatedIndex])) {
				a[index] = (T) aux[midInvistigatedIndex++];
				count++;
			} else {
				a[index] = (T) aux[firstInvistigatedIndex++];
			}
		}
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
