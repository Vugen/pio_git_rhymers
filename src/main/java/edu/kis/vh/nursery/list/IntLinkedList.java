package edu.kis.vh.nursery.list;
//TODO: LinkedList is not used. Make it usefull or safe delete it.
public class IntLinkedList {

	private static final int EMPTY_ARRAY_RETURN_CODE = -1;
	Node last;
	int i;

	public static int getEmptyArrayReturnCode() {
		return EMPTY_ARRAY_RETURN_CODE;
	}

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return getEmptyArrayReturnCode();
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return getEmptyArrayReturnCode();
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
