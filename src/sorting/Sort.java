package sorting;

public interface Sort {
	<E extends Comparable<E>>E[] sort(E[] array);
}
