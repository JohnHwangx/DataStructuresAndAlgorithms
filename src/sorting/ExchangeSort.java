package sorting;

public class ExchangeSort implements Sort{
	public static void BubbleSort(Integer[] A) {
		System.out.println("Bubble Sort");
		int i, j;
		boolean exchange = false;
		int temp;
		for (i = 0; i < A.length; i++) {
			exchange = false;
			for (j = A.length - 1; j > i; j--) {
				if (A[j] < A[j - 1]) {
					temp = A[j];
					A[j] = A[j - 1];
					A[j - 1] = temp;
					exchange = true;
				}
			}
			if (!exchange) {
				return;
			}
			PrintOperator.Print(A);
		}
	}

	public static <E extends Comparable<E>> void bubbleSort(E[] array) {
		System.out.println("Bubble Sort:");
		int i, j;
		boolean exchange;
		E temp;
		for (i = 0; i < array.length; i++) {
			exchange = false;
			for (j = array.length - 1; j > i; j--) {
				if (array[j].compareTo(array[j - 1]) < 0) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
					exchange = true;
				}
			}
			if (!exchange) {
				return;
			}
			PrintOperator.Print(array);
		}
	}

	public static void QuickSort(Integer[] A) {
		System.out.println("Quick Sort:");
		int low = 0, high = A.length - 1;
		QuickSort(A, low, high);
	}

	private static void QuickSort(Integer[] a, int low, int high) {
		// TODO Auto-generated method stub
		if (low < high) {
			int pivot = GetPosition(a, low, high);
			QuickSort(a, low, pivot - 1);
			QuickSort(a, pivot + 1, high);
		}
		PrintOperator.Print(a);
	}

	private static int GetPosition(Integer[] A, int low, int high) {
		int pivot = A[low];
		while (low < high) {
			while (low < high && A[high] >= pivot) {
				--high;
			}
			A[low] = A[high];

			while (low < high && A[low] <= pivot) {
				++low;
			}
			A[high] = A[low];
		}
		A[low] = pivot;
		return low;
	}

	public static <E extends Comparable<E>> void quickSort(E[] array) {
		System.out.println("Quick Sort:");
		int low = 0, high = array.length - 1;
		quickSort(array, low, high);
	}

	private static <E extends Comparable<E>> void quickSort(E[] array, int low, int high) {
		// TODO Auto-generated method stub
		if (low < high) {
			int pivot = getPosition(array, low, high);
			quickSort(array, low, pivot - 1);
			quickSort(array, pivot + 1, high);
		}
		PrintOperator.Print(array);
	}

	private static <E extends Comparable<E>> int getPosition(E[] array, int low, int high) {
		// TODO Auto-generated method stub
		E pivot = array[low];
		while (low < high) {
			while (low < high && array[high].compareTo(pivot) >= 0) {
				--high;
			}
			array[low] = array[high];
			
			while (low < high && array[low].compareTo(pivot) <= 0) {
				++low;
			}
			array[high] = array[low];
		}
		array[low] = pivot;
		return low;
	}

	@Override
	public <E> void sort(E[] array) {
		// TODO Auto-generated method stub
		
	}
}
