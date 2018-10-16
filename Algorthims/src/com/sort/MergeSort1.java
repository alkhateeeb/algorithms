package com.sort;

public class MergeSort1 {

	private static Object[] aux;

	public static <T> void sort(T[] a) {
		// 66, 50, 33, 2, 22, 44, 1, 3, 12
		sort(a, 0, a.length - 1);
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
		aux = new Object[high - min + 1];

		// map aux indices
		int firstAuxIndex = 0;
		int midAuxIndex = aux.length / 2;
		if (midAuxIndex % 2 != 0 && midAuxIndex != 1) {
			midAuxIndex++;
		}
		int firstIndex = min;
		int midIndex = mid;
		int startAuxIndex = min;
		for (int index = 0; index < aux.length; index++) {
			aux[index] = a[startAuxIndex++];
		}

		int index = min;
		int midIndexObserver = 0;
		while (midIndex < high && firstIndex <= mid && firstAuxIndex < midAuxIndex) {
			if (less(aux[midAuxIndex], aux[firstAuxIndex])) {
				a[index] = (T) aux[midAuxIndex];
				midAuxIndex++;
				midIndex++;
				midIndexObserver++;
			} else {
				a[index] = (T) aux[firstAuxIndex];
				firstAuxIndex++;
				firstIndex++;
			}
			index++;
		}

		for (int index2 = firstAuxIndex; index2 < midAuxIndex - midIndexObserver; index2++) {
			a[index++] = (T) aux[index2];
		}
		int max = aux.length;
		for (int index2 = midAuxIndex; index2 < max; index2++) {
			a[index++] = (T) aux[index2];
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