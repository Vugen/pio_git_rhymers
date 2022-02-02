package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int EMPTY_ARRAY_VALUE = -1;

	private static final int NUMBERS_ARRAY_SIZE = 12;

	private int[] NUMBERS = new int[NUMBERS_ARRAY_SIZE];

	public int total = EMPTY_ARRAY_VALUE;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
			return total == EMPTY_ARRAY_VALUE;
	}
	public boolean isFull() {
		return total == 11;
	}

	protected int peekABoo() {
		if (callCheck())
			return EMPTY_ARRAY_VALUE;
		return NUMBERS[total];
	}
			
	public int countOut() {
		if (callCheck())
			return EMPTY_ARRAY_VALUE;
		return NUMBERS[total--];
	}

}
