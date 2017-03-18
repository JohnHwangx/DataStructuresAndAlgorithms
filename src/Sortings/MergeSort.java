package Sortings;

public class MergeSort {
//	private static Integer[] Aux; // auxiliary array for merges

	public static void Sort(Integer[] a) {
//		Aux = new Integer[a.length]; // Allocate space just once.
		Sort(a, 0, a.length - 1);
		PrintOperator.Print(a);
	}

	private static void Sort(Integer[] a, int lo, int hi) { 
		// Sort a[low..high].
		if (hi <= lo)
			return;
		int mid = lo + (hi - lo) / 2;
		Sort(a, lo, mid); // Sort left half.
		Sort(a, mid + 1, hi); // Sort right half.
		Merge(a, lo, mid, hi); // Merge results (code on page 271).
	}

	private static void Merge(Integer[] a, int lo, int mid, int hi) {
		// Merge a[low..mid] with a[mid+1..high].
		Integer[] Aux = a.clone(); // Allocate space just once.
		int i = lo, j = mid + 1;
//		for (int k = lo; k <= hi; k++) // Copy a[low..high] to aux[low..high].
//			Aux[k] = a[k];
		for (int k = lo; k <= hi; k++) // Merge back to a[low..high].
			if (i > mid)
				a[k] = Aux[j++];
			else if (j > hi)
				a[k] = Aux[i++];
			else if (Aux[j] < Aux[i])
				a[k] = Aux[j++];
			else
				a[k] = Aux[i++];
	}

	public static<E extends Comparable<E>> void sort(E[] a) {
//		aux = E[a.length]; // Allocate space just once.
		sort(a, 0, a.length - 1);
		PrintOperator.Print(a);
	}

	private static<E extends Comparable<E>> void sort(E[] a, int lo, int hi) { 
		// Sort a[low..high].
		if (hi <= lo)
			return;
		int mid = lo + (hi - lo) / 2;
		sort(a, lo, mid); // Sort left half.
		sort(a, mid + 1, hi); // Sort right half.
		merge(a, lo, mid, hi); // Merge results (code on page 271).
	}

	private static<E extends Comparable<E>> void merge(E[] a, int lo, int mid, int hi) { 
		// Merge a[low..mid] with a[mid+1..high].
		E[] aux=a.clone();
		int i = lo, j = mid + 1;
//		for (int k = lo; k <= hi; k++) // Copy a[low..high] to aux[low..high].
//			aux[k] = a[k];
		for (int k = lo; k <= hi; k++) // Merge back to a[low..high].
			if (i > mid)
				a[k] = aux[j++];
			else if (j > hi)
				a[k] = aux[i++];
			else if (aux[j].compareTo(aux[i])<0)
				a[k] =aux[j++];
			else
				a[k] = aux[i++];
	}
	
/**´ý²âÊÔ
	public static void Sort2(Integer[] A) {
		Integer[] temp = new Integer[A.length];
		Sort(A, 0, A.length - 1, temp);
	}

	private static void Sort(Integer[] a, int lo, int hi, Integer[] aux) { 
		// Sort a[low..high].
		if (hi <= lo)
			return;
		int mid = (hi + lo) / 2;
		Sort(a, lo, mid, aux); // Sort left half.
		Sort(a, mid + 1, hi, aux); // Sort right half.
		Merge(a, lo, mid, hi, aux); // Merge results (code on page 271).
	}

	private static void Merge(Integer[] A, int low, int mid, int high, Integer[] temp) {
		//for (int k = low; k <= high;k++)
		int i = low, j = mid + 1;
		int m = mid, n = high;
		int k = 0;
		while (i <= m&&j <= n)
		{
			if (A[i] <= A[j])
				temp[k++] = A[i++];
			else
				temp[k++] = A[j++];
		}

		while (i <= m)
			temp[k++] = A[i++];
		while (j <= n)
			temp[k++] = A[j++];

		for (i = 0; i < k; i++)
			A[low + i] = temp[i];
	}
	*/
	
}
