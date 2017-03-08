package Sorting;

public class InsertSort {
	public InsertSort() {
		// TODO Auto-generated constructor stub

	}

	public static void InsertionSort(Integer[] A) {
		System.out.println("Insertion Sort:");
		int i, j, temp;
		for (i = 1; i < A.length; i++) {
			if (A[i] < A[i - 1]) {
				temp = A[i];
				for (j = i - 1; j != -1 && temp < A[j]; j--) {
					A[j + 1] = A[j];
				}
				A[j + 1] = temp;
			}
			PrintOperator.Print(A);
		}
	}

	public static <E extends Comparable<E>> void insertionSort(E[] array) {
		System.out.println("Insertion Sort");
		int i, j;
		for (i = 1; i < array.length; i++) {
			if (array[i].compareTo(array[i - 1]) < 0) {
				E temp = array[i];
				for (j = i - 1; j > -1 && temp.compareTo(array[j]) < 0; j--) {
					array[j + 1] = array[j];
				}
				array[j + 1] = temp;
			}
			PrintOperator.Print(array);
		}
	}
}
