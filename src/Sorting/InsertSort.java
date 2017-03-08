package Sorting;

public class InsertSort {
	public InsertSort() {
		// TODO Auto-generated constructor stub

	}

	public static void InsertionSort(int[] A) {
		System.out.println("Insertion Sort:");
		int i, j, temp;
		for (i = 1; i < A.length; i++) {
			if (A[i] < A[i - 1]) {
				temp = A[i];
				for (j = i - 1;j!=-1&& temp < A[j]; j--) {
					A[j + 1] = A[j];
				}
				A[j + 1] = temp;
			}
			PrintOperator.Print(A);
		}
	}
}
