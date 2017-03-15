package Sorting;

public class MergeSort {
	private static Integer[] aux; // auxiliary array for merges

	public static void sort(Integer[] a) {
		aux = new Integer[a.length]; // Allocate space just once.
		sort(a, 0, a.length - 1);
		PrintOperator.Print(a);
	}

	private static void sort(Integer[] a, int lo, int hi) { // Sort
																// a[low..high].
		if (hi <= lo)
			return;
		int mid = lo + (hi - lo) / 2;
		sort(a, lo, mid); // Sort left half.
		sort(a, mid + 1, hi); // Sort right half.
		merge(a, lo, mid, hi); // Merge results (code on page 271).
	}

	private static void merge(Integer[] a, int lo, int mid, int hi) { 
		// Merge																		// a[low..mid]
																		// with
																		// a[mid+1..high].
		int i = lo, j = mid + 1;
		for (int k = lo; k <= hi; k++) // Copy a[low..high] to aux[low..high].
			aux[k] = a[k];
		for (int k = lo; k <= hi; k++) // Merge back to a[low..high].
			if (i > mid)
				a[k] = aux[j++];
			else if (j > hi)
				a[k] = aux[i++];
			else if (aux[j]<aux[i])
				a[k] = aux[j++];
			else
				a[k] = aux[i++];
	}
}
