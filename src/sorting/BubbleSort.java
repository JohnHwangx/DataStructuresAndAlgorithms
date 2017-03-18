package sorting;

public class BubbleSort implements Sort {

	@Override
	public <E extends Comparable<E>> E[] sort(E[] array) {
		System.out.println("Bubble Sort:");
		E[] result=array.clone();
		int i, j;
		boolean exchange;
		E temp;
		for (i = 0; i < result.length; i++) {
			exchange = false;
			for (j = result.length - 1; j > i; j--) {
				if (result[j].compareTo(result[j - 1]) < 0) {
					temp = result[j];
					result[j] = result[j - 1];
					result[j - 1] = temp;
					exchange = true;
				}
			}
			if (!exchange) {
				break;
			}
		}
		return result;
	}

}
