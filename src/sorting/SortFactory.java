package sorting;

public class SortFactory {
	public Sort GetSort(String sortName) {
		if (sortName == null) {
			return null;
		}
		switch (sortName) {
		case "BubbleSort":
			return new BubbleSort();
		case "QuickSort":
			return new QuickSort();
		case "SelectionSort":
			return new SelectionSort();
		case "ShellSort":
			return new ShellSort();
		case "InsertionSort":
			return new InsertionSort();
		case "HeapSort":
			return new HeapSort();
		case "MergeSort":
			return new MergeSort();
		default:
			return null;
		}
	}
}
