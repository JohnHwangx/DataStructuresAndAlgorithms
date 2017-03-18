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
		// 最后一个有孩子的节点的位置 i= (length -1) / 2
		for (int i = A.length / 2; i >= 0; --i) {
			HeapAdjust(A, i, A.length);
		}
	}

	private static void HeapAdjust(Integer[] a, int i, int length) {
		// TODO Auto-generated method stub
		int tmp = a[i];
		int child = 2 * i + 1; // 左孩子结点的位置。(i+1 为当前调整结点的右孩子结点的位置)
		while (child < length) {
			if (child + 1 < length && a[child] < a[child + 1]) { // 如果右孩子大于左孩子(找到比当前待调整结点大的孩子结点)
				++child;
			}
			if (a[i] < a[child]) { // 如果较大的子结点大于父结点
				a[i] = a[child]; // 那么把较大的子结点往上移动，替换它的父结点
				i = child; // 重新设置s ,即待调整的下一个结点的位置
				child = 2 * i + 1;
			} else { // 如果当前待调整结点大于它的左右孩子，则不需要调整，直接退出
				break;
			}
			a[i] = tmp; // 当前待调整的结点放到比其大的孩子结点位置上
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
		// 最后一个有孩子的节点的位置 i= (length -1) / 2
		for (int i = array.length / 2; i >= 0; --i) {
			heapAdjust(array, i, array.length);
		}
	}

	private static <E extends Comparable<E>> void heapAdjust(E[] array, int i, int length) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		E tmp = array[i];
		int child = 2 * i + 1; // 左孩子结点的位置。(i+1 为当前调整结点的右孩子结点的位置)
		while (child < length) {
			if (child + 1 < length && array[child].compareTo(array[child + 1])<0) { // 如果右孩子大于左孩子(找到比当前待调整结点大的孩子结点)
				++child;
			}
			if (array[i].compareTo(array[child])<0 ) { // 如果较大的子结点大于父结点
				array[i] = array[child]; // 那么把较大的子结点往上移动，替换它的父结点
				i = child; // 重新设置s ,即待调整的下一个结点的位置
				child = 2 * i + 1;
			} else { // 如果当前待调整结点大于它的左右孩子，则不需要调整，直接退出
				break;
			}
			array[i] = tmp; // 当前待调整的结点放到比其大的孩子结点位置上
		}
		PrintOperator.Print(array);
	}
}
