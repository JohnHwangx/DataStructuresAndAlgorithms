package sorting;

import Sortings.PrintOperator;

public class QuickSort implements Sort {

	@Override
	public <E extends Comparable<E>> E[] sort(E[] array) {
		System.out.println("Quick Sort:");
		E[] result=array.clone();
		int low = 0, high = result.length - 1;
		quickSort(result, low, high);
		return result;
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
}
