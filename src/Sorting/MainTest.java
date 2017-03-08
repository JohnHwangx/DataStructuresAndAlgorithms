package Sorting;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Sort:");
		int[] A = { 49, 38, 65, 97, 76, 13, 27, 49 };
		PrintOperator.Print(A);
		
		System.out.println("After sort:");
		InsertSort.InsertionSort(A);
	}

}
