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
		// 最后一个有孩子的节点的位置 i= (length -1) / 2
		for (int i = array.length / 2; i >= 0; --i) {
			heapAdjust(array, i, array.length);
		}
	}

	private static <E extends Comparable<E>> void heapAdjust(E[] array, int i, int length) {
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
	}
	
}
