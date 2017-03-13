package Sorting;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Sort:");
		Integer[] A = { 49, 38, 65, 97, 76, 13, 27, 49 };
		Character[] characters={'a','b','j','d','l','e','h','q','n','l'};
		PrintOperator.Print(A);
		
		System.out.println("After sort:");
		
//		InsertSort.InsertionSort(A);//Straight Insert Sort
//		InsertSort.insertionSort(characters);//Straight Insert Sort with Generic
//		InsertSort.ShellSort(A);//Shell Sort
//		InsertSort.shellSort(characters);//Shell sort with Generic
		
//		ExchangeSort.BubbleSort(A);//Bubble Sort
//		ExchangeSort.bubbleSort(characters);
//		ExchangeSort.QuickSort(A);
//		ExchangeSort.quickSort(characters);
		
//		SelectSort.SelectionSort(A);
//		SelectSort.selectionSort(characters);
		SelectSort.HeapSort(A);
	}
	
}
