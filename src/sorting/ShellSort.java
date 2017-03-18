package sorting;

public class ShellSort implements Sort {

	@Override
	public <E extends Comparable<E>> E[] sort(E[] array) {
		// TODO Auto-generated method stub
		System.out.println("Shell's Sort:");
		E[] result = array.clone();
		int i, j, n = result.length;
		E temp;
		int d = n / 2;
		while (d > 0) {
			for (i = d; i < n; i++) {
				temp = result[i];
				j = i - d;
				while (j >= 0 && temp.compareTo(result[j]) < 0) {
					result[j + d] = result[j];
					j = j - d;
				}
				result[j + d] = temp;
			}
			d = d / 2;
		}
		return result;
	}

}
