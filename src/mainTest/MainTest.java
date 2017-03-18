package mainTest;
import sorting.*;

public class MainTest {
	public static void main(String[] args) {
		SortFactory sortFactory=new SortFactory();
		Sort sort=sortFactory.GetSort("BubbleSort");
		Integer[] integers={ 49, 38, 65, 97, 76, 13, 27, 49 };
		Character[] characters={'a','b','j','d','l','e','h','q','n','l'};
		
		PrintOperator.Print(sort.sort(integers));
		PrintOperator.Print(sort.sort(characters));
	}
}
