package LinkedLists;

public class DoublyLinkedList {

}

class IntDLLNode {
	public int info;
	public IntDLLNode next, prev;

	public IntDLLNode(int el) {
		this(el, null, null);
	}

	public IntDLLNode(int el, IntDLLNode n, IntDLLNode p) {
		info = el;
		next = n;
		prev = p;
	}
}

class IntDLList implements ILinkedList {
	private IntDLLNode head, tail;

	public IntDLList() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * 在尾部添加节点
	 * 
	 * @param el
	 */
	public void addToTail(int el) {
		if (!isEmpty()) {
			tail = new IntDLLNode(el, null, tail);
			tail.prev.next = tail;
		} else
			head = tail = new IntDLLNode(el);
	}

	/**
	 * 在头部添加节点
	 * 
	 * @param el
	 */
	public void addToHead(int el) {
		if (!isEmpty()) {
			head = new IntDLLNode(el, head, null);
			head.next.prev = head;
		} else {
			head = tail = new IntDLLNode(el);
		}
	}

	public int deleteFromTail() {
		int el = tail.info;
		if (head == tail) // if only one node in the list;
			head = tail = null;
		else { // if more than one node in the list;
			tail = tail.prev;
			tail.next = null;
		}
		return el;
	}

	/**
	 * 刪除头节点
	 * 
	 * @return
	 */
	public int deleteFromHead() {
		int el = head.info;
		if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
			head.prev = null;
		}
		return el;
	}

	public void delete(int el) {
		if (!isEmpty()) {
			if (head == tail && el == head.info) {
				head = tail = null;
			} else if (el == head.info) {
				head = head.next;
				head.prev = null;
			} else if (el == tail.info) {
				tail = tail.prev;
				tail.next = null;
			} else {
				IntDLLNode pred, tmp;// and el is in a non-head node;
				for (pred = head, tmp = head.next; tmp != null && tmp.info != el; pred = pred.next, tmp = tmp.next)
					;
				if (tmp != null) { // if el was found;
					pred.next = tmp.next;
					if (tmp == tail) // if el is in the last node;
						tail = pred;
				}
			}
		}
		System.out.println("Hello World");
	}
}
