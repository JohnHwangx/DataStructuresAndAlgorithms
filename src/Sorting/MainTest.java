package Sorting;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Sort:");
		Integer[] A = { 49, 38, 65, 97, 76, 13, 27, 49 };
		Character[] characters={'a','b','j','d','l','e'};
		PrintOperator.Print(A);
		
		System.out.println("After sort:");
//		InsertSort.insertionSort(characters);//Straight Insert Sort
//		ExchangeSort.BubbleSort(A);//Bubble Sort
		ExchangeSort.bubbleSort(characters);
	}
	
}
