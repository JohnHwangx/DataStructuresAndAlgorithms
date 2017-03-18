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
		default:
			return null;
		}
	}
}
