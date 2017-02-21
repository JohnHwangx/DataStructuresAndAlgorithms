package LinkedLists;

public class CircularList {

}

class IntCLNode {
	public int info;
	public IntCLNode next;

	public IntCLNode(int i) {
		this(i, null);
	}

	public IntCLNode(int i, IntCLNode n) {
		info = i;
		next = n;
	}
}

class IntCList implements ILinkedList {
	IntCLNode tail;

	public IntCList() {
		tail = null;
	}

	public boolean isEmpty() {
		return tail == null;
	}

	public void printAll() {
		for (IntCLNode tmp = tail.next; tmp != null; tmp = tmp.next)
			System.out.println(tmp.info + " ");
	}

	public void addToTail(int el) {
		if (isEmpty()) {
			tail = new IntCLNode(el);
			tail.next = tail;
		} else {
			tail.next = new IntCLNode(el, tail.next);// 1.先创建el节点，其next指向tail.next；2.tail.next指向新创建的el节点
			tail = tail.next;// 3.将新创建的节点设为tail
		}
	}

	@Override
	public void addToHead(int el) {
		if (isEmpty()) {
			tail = new IntCLNode(el);
			tail.next = tail;
		} else {
			tail.next = new IntCLNode(el, tail.next);// 1.先创建el节点，其next指向tail.next；2.tail.next指向新创建的el节点
		}
	}

	@Override
	public int deleteFromHead() {
		int el = tail.next.info;
		if (tail.next == tail) {
			tail = null;
		} else {
			tail.next = tail.next.next;
		}
		return el;
	}

	@Override
	public int deleteFromTail() {
		int el = tail.next.info;
		if (tail.next == tail) {
			tail = null;
		} else {
			IntCLNode tmp; // find the predecessor of tail;
			for (tmp = tail.next; tmp.next != tail; tmp = tmp.next)
				;
			tmp.next = tail.next;
			tail = tmp; // the predecessor of tail becomes tail;
			tail.next = null;
		}
		return el;
	}

	@Override
	public void delete(int el) {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
			if (tail.next == tail && el == tail.info) {
				tail = null;
			} else if (el == tail.next.info) {
				tail.next = tail.next.next;
			} else {
				IntCLNode pred, tmp;
				for (pred = tail.next, tmp = tail.next.next; tmp != null
						&& tmp.info != el; pred = pred.next, tmp = tmp.next)
					;
				if (tmp != null) {
					pred.next = tmp.next;
					if (tmp == tail) {
						tail = pred;
					}
				}
			}
		}
	}
}