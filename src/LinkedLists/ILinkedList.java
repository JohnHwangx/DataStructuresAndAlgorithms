package LinkedLists;

public interface ILinkedList {
	boolean isEmpty();

	void addToHead(int el);

	void addToTail(int el);

	int deleteFromHead();

	int deleteFromTail();

	void delete(int el);
}
