package Sorting;

public class ExchangeSort {
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
}
