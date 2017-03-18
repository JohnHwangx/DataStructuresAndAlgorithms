package Sortings;

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

	public static void ShellSort(Integer[] A) {
		int i, j;
		int temp;
		int d = A.length / 2;
		while (d > 0) {
			for (i = d; i < A.length; i++) {
				temp = A[i];
				j = i - d;
				while (j >= 0 && A[j] > temp) {
					A[j + d] = A[j];
					j = j - d;
				}
				A[j + d] = temp;
			}
			d = d / 2;
			PrintOperator.Print(A);
		}
	}

	public static <E extends Comparable<E>> void shellSort(E[] array) {
		int i, j, n = array.length;
		E temp;
		int d = n / 2;
		while (d > 0) {
			for (i = d; i < n; i++) {
				temp = array[i];
				j = i - d;
				while (j >= 0 && temp.compareTo(array[j]) < 0) {
					array[j + d] = array[j];
					j = j - d;
				}
				array[j + d] = temp;
			}
			d = d / 2;
			PrintOperator.Print(array);
		}
	}
}
