package sorting;

public class MergeSort implements Sort {

	@Override
	public <E extends Comparable<E>> E[] sort(E[] array) {
		System.out.println("Merge Sort:");
		E[] result=array.clone();
		sort(result, 0, result.length - 1);
		return result;
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

}
