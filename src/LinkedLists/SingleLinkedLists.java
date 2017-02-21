package LinkedLists;

public class SingleLinkedLists {

}

class IntSLLNode {
	public int info;
	public IntSLLNode next;

	public IntSLLNode(int i) {
		this(i, null);
	}

	public IntSLLNode(int i, IntSLLNode n) {
		info = i;
		next = n;
	}
}

/**
 * @author john
 *
 */
class IntSLList implements ILinkedList {
	protected IntSLLNode head, tail;// 指向头节点和指向尾结点

	public IntSLList() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * 在头部插入新结点
	 * 
	 * @param el
	 *            新结点
	 */
	public void addToHead(int el) {
		head = new IntSLLNode(el, head);
		if (tail == null)
			tail = head;
	}

	/**
	 * 在尾部插入新结点
	 * 
	 * @param el
	 *            新节点
	 */
	public void addToTail(int el) {
		if (!isEmpty()) {
			tail.next = new IntSLLNode(el);
			tail = tail.next;
		} else
			head = tail = new IntSLLNode(el);
	}

	/**
	 * 在头部删除结点
	 * 
	 * @return 结点信息
	 */
	public int deleteFromHead() { // delete the head and return its info;
		int el = head.info;
		if (head == tail) // if only one node on the list;
			head = tail = null;
		else
			head = head.next;
		return el;
	}

	/**
	 * 从尾部删除节点
	 * 
	 * @return 节点信息
	 */
	public int deleteFromTail() { // delete the tail and return its info;
		int el = tail.info;
		if (head == tail) // if only one node on the list;
			head = tail = null;
		else { // if more than one node on the list,
			IntSLLNode tmp; // find the predecessor of tail;
			for (tmp = head; tmp.next != tail; tmp = tmp.next)
				;
			tail = tmp; // the predecessor of tail becomes tail;
			tail.next = null;
		}
		return el;
	}

	public void printAll() {
		for (IntSLLNode tmp = head; tmp != null; tmp = tmp.next)
			System.out.print(tmp.info + " ");
	}

	public boolean isInList(int el) {
		IntSLLNode tmp;
		for (tmp = head; tmp != null && tmp.info != el; tmp = tmp.next)
			;
		return tmp != null;
	}

	public void delete(int el) { // delete the node with an element el;
		if (!isEmpty())
			if (head == tail && el == head.info) // if only one
				head = tail = null; // node on the list;
			else if (el == head.info) // if more than one node on the
				head = head.next; // list; and el is in the head node;
			else { // if more than one node in the list
				IntSLLNode pred, tmp;// and el is in a non-head node;
				for (pred = head, tmp = head.next; tmp != null && tmp.info != el; pred = pred.next, tmp = tmp.next)
					;
				if (tmp != null) { // if el was found;
					pred.next = tmp.next;
					if (tmp == tail) // if el is in the last node;
						tail = pred;
				}
			}
	}
}

class SLLNode {
	public Object info;
	public SLLNode next;

	public SLLNode() {
		next = null;
	}

	public SLLNode(Object el) {
		info = el;
		next = null;
	}

	public SLLNode(Object el, SLLNode ptr) {
		info = el;
		next = ptr;
	}
}

class SLList {
	protected SLLNode head = null;

	public SLList() {
	}

	public boolean isEmpty() {
		return head == null;
	}

	public Object first() {
		return head.info;
	}

	public void printAll(java.io.PrintStream out) {
		for (SLLNode tmp = head; tmp != null; tmp = tmp.next)
			out.print(tmp.info);
	}

	public void add(Object el) {
		head = new SLLNode(el, head);
	}

	public Object find(Object el) {
		SLLNode tmp = head;
		for (; tmp != null && !el.equals(tmp.info); tmp = tmp.next)
			;
		if (tmp == null)
			return null;
		else
			return tmp.info;
	}

	public Object deleteHead() { // remove the head and return its info;
		Object el = head.info;
		head = head.next;
		return el;
	}

	public void delete(Object el) { // find and remove el;
		if (head != null) // if nonempty list;
			if (el.equals(head.info)) // if head needs to be removed;
				head = head.next;
			else {
				SLLNode pred = head, tmp = head.next;
				for (; tmp != null && !(tmp.info.equals(el)); pred = pred.next, tmp = tmp.next)
					;
				if (tmp != null) // if found
					pred.next = tmp.next;
			}
	}
}
