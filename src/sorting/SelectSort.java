package sorting;

import org.ietf.jgss.Oid;

public class SelectSort {
	public static void SelectionSort(Integer[] A) {
		System.out.println("Simple Selection Sort:");
		int temp, i, j, k;
		for (i = 0; i < A.length - 1; i++) {
			k = i;
			for (j = i + 1; j < A.length; j++) {
				if (A[j] < A[k]) {
					k = j;
				}
			}
			if (i != k) {
				temp = A[i];
				A[i] = A[k];
				A[k] = temp;
			}
			PrintOperator.Print(A);
		}
	}

	public static <E extends Comparable<E>> void selectionSort(E[] array) {
		E temp;
		for (int i = 0; i < array.length - 1; i++) {
			int k = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[k].compareTo(array[j]) > 0) {
					k = j;
				}
			}
			if (i != k) {
				temp = array[i];
				array[i] = array[k];
				array[k] = temp;
			}
			PrintOperator.Print(array);
		}
	}

	public static void HeapSort(Integer[] A) {
		BuildingHeap(A);
		for (int i = A.length - 1; i > 0; i--) {
			int temp = A[i];
			A[i] = A[0];
			A[0] = temp;
			HeapAdjust(A, 0, i);
		}
	}

	private static void BuildingHeap(Integer A[]) {
		// ���һ���к��ӵĽڵ��λ�� i= (length -1) / 2
		for (int i = A.length / 2; i >= 0; --i) {
			HeapAdjust(A, i, A.length);
		}
	}

	private static void HeapAdjust(Integer[] a, int i, int length) {
		// TODO Auto-generated method stub
		int tmp = a[i];
		int child = 2 * i + 1; // ���ӽ���λ�á�(i+1 Ϊ��ǰ���������Һ��ӽ���λ��)
		while (child < length) {
			if (child + 1 < length && a[child] < a[child + 1]) { // ����Һ��Ӵ�������(�ҵ��ȵ�ǰ����������ĺ��ӽ��)
				++child;
			}
			if (a[i] < a[child]) { // ����ϴ���ӽ����ڸ����
				a[i] = a[child]; // ��ô�ѽϴ���ӽ�������ƶ����滻���ĸ����
				i = child; // ��������s ,������������һ������λ��
				child = 2 * i + 1;
			} else { // �����ǰ�������������������Һ��ӣ�����Ҫ������ֱ���˳�
				break;
			}
			a[i] = tmp; // ��ǰ�������Ľ��ŵ������ĺ��ӽ��λ����
		}
		PrintOperator.Print(a);
	}

	public static <E extends Comparable<E>> void heapSort(E[] array) {
		buildingHeap(array);
		for (int i = array.length - 1; i > 0; i--) {
			E temp = array[i];
			array[i] = array[0];
			array[0] = temp;
			heapAdjust(array, 0, i);
		}
	}

	private static <E extends Comparable<E>> void buildingHeap(E[] array) {
		// ���һ���к��ӵĽڵ��λ�� i= (length -1) / 2
		for (int i = array.length / 2; i >= 0; --i) {
			heapAdjust(array, i, array.length);
		}
	}

	private static <E extends Comparable<E>> void heapAdjust(E[] array, int i, int length) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
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
		PrintOperator.Print(array);
	}
}
