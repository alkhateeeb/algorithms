package com.sort;

public class MergeSort1 {

	private static Object[] aux;

	public static <T> void sort(T[] a) {
		// 66, 50, 33, 2, 22, 44, 1, 3, 12
		sort(a, 0, a.length);
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
		int firstAuxIndex = mid
		
		int firstIndex = min;
		int midIndex = mid;
		int startAuxIndex = min;
		for (int index = 0; index < aux.length; index++) {
			aux[index] = a[startAuxIndex++];
		}

		int index = min;
		while (midIndex <= high && firstIndex <= mid) {
			if (less(aux[midIndex], aux[firstIndex])) {
				a[index] = (T) aux[midIndex];
				midIndex++;
			} else {
				a[firstIndex] = (T) aux[firstIndex];
				firstIndex++;
			}
			index++;
		}
		for (int index2 = firstIndex; firstIndex <= mid; index2++) {
			a[index++] = (T) aux[index2];
		}
		for (int index2 = midIndex; index <= high; index++) {
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
