package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int FULL_ARRAY = 11;

	private static final int EMPTY_ARRAY_VALUE = -1;

	private static final int NUMBERS_ARRAY_SIZE = 12;

	private int[] NUMBERS = new int[getNumbersArraySize()];

	private int total = getEmptyArrayValue();

	public static int getNumbersArraySize() {
		return NUMBERS_ARRAY_SIZE;
	}

	public static int getEmptyArrayValue() {
		return EMPTY_ARRAY_VALUE;
	}

	public static int getFullArray() {
		return FULL_ARRAY;
	}

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
			return total == getEmptyArrayValue();
	}
	public boolean isFull() {
		return total == getFullArray();
	}

	protected int peekABoo() {
		if (callCheck())
			return getEmptyArrayValue();
		return NUMBERS[total];
	}
			
	public int countOut() {
		if (callCheck())
			return getEmptyArrayValue();
		return NUMBERS[total--];
	}

}
