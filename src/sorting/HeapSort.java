package sorting;

public class HeapSort implements Sort {

	@Override
	public <E extends Comparable<E>> E[] sort(E[] array) {
		// TODO Auto-generated method stub
		System.out.println("Heap Sort:");
		E[] result=array.clone();
		buildingHeap(result);
		for (int i = result.length - 1; i > 0; i--) {
			E temp = result[i];
			result[i] = result[0];
			result[0] = temp;
			heapAdjust(result, 0, i);
		}
		return result;
	}
	
	private static <E extends Comparable<E>> void buildingHeap(E[] array) {
		// ���һ���к��ӵĽڵ��λ�� i= (length -1) / 2
		for (int i = array.length / 2; i >= 0; --i) {
			heapAdjust(array, i, array.length);
		}
	}

	private static <E extends Comparable<E>> void heapAdjust(E[] array, int i, int length) {
		E tmp = array[i];
		int child = 2 * i + 1; // ���ӽ���λ�á�(i+1 Ϊ��ǰ���������Һ��ӽ���λ��)
		while (child < length) {
			if (child + 1 < length && array[child].compareTo(array[child + 1])<0) { // ����Һ��Ӵ�������(�ҵ��ȵ�ǰ����������ĺ��ӽ��)
				++child;
			}
			if (array[i].compareTo(array[child])<0 ) { // ����ϴ���ӽ����ڸ����
				array[i] = array[child]; // ��ô�ѽϴ���ӽ�������ƶ����滻���ĸ����
				i = child; // ��������s ,������������һ������λ��
				child = 2 * i + 1;
			} else { // �����ǰ�������������������Һ��ӣ�����Ҫ������ֱ���˳�
				break;
			}
			array[i] = tmp; // ��ǰ�������Ľ��ŵ������ĺ��ӽ��λ����
		}
	}
	
}
