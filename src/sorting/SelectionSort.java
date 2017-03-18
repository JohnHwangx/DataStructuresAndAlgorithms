package sorting;

public class SelectionSort implements Sort {

	@Override
	public <E extends Comparable<E>> E[] sort(E[] array) {
		System.out.println("Selection Sort:");
		E temp;
		E[] result=array.clone();
		for (int i = 0; i < result.length - 1; i++) {
			int k = i;
			for (int j = i + 1; j < result.length; j++) {
				if (result[k].compareTo(result[j]) > 0) {
					k = j;
				}
			}
			if (i != k) {
				temp = result[i];
				result[i] = result[k];
				result[k] = temp;
			}
		}
		return result;
	}

}
