package com.presentation;

import com.sort.MergeSort;
import com.sort.MergeSort1;
import com.sort.ShellSort;

public class SortTest {

	public static void main(String[] args) {
		Integer a[] = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
//		Integer a[] = { 2, 3, 4, 5, 15, 19, 26, 27, 36, 38, 44, 46, 47, 48, 50 };
		MergeSort1.<Integer>sort(a);
		MergeSort1.<Integer>print(a);
//		System.out.println(Math.ceil(3/2));
	}

}
