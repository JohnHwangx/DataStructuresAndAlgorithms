package Sortings;

public class PrintOperator {
	public static<E> void Print(E[] array) {
		for (E element:array) {
			System.out.printf( "%s ", element );
		}
		System.out.println();
	}	
}
