package sorting;

public class InsertionSort implements Sort {

	@Override
	public <E extends Comparable<E>> E[] sort(E[] array) {
		System.out.println("Insertion Sort");
		E[] result=array.clone();
		int i, j;
		for (i = 1; i < result.length; i++) {
			if (result[i].compareTo(result[i - 1]) < 0) {
				E temp = result[i];
				for (j = i - 1; j > -1 && temp.compareTo(result[j]) < 0; j--) {
					result[j + 1] = result[j];
				}
				result[j + 1] = temp;
			}
		}
		return result;
	}

}
