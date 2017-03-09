package Sorting;

public class SelectSort {
	public static void SelectionSort(Integer[] A) {
		System.out.println("Simple Selection Sort:");
		int temp,i,j,k;
		for(i=0;i<A.length-1;i++){
			k=i;
			for(j=i+1;j<A.length;j++){
				if (A[j]<A[k]) {
					k=j;
				}
			}
			if (i!=k) {
				temp=A[i];
				A[i]=A[k];
				A[k]=temp;
			}
			PrintOperator.Print(A);
		}
	}
	
	public static<E extends Comparable<E>> void selectionSort(E[] array) {
		E temp;
		for (int i = 0; i < array.length-1; i++) {
			int k=i;
			for (int j = i+1; j < array.length; j++) {
				if (array[k].compareTo(array[j])>0) {
					k=j;
				}
			}
			if (i!=k) {
				temp=array[i];
				array[i]=array[k];
				array[k]=temp;
			}
			PrintOperator.Print(array);
		}
	}
}
