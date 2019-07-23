class GenericStack<T> {
	private final static int INITIAL_SIZE = 16;
	private T[] elements;
	private int size;

	public GenericStack() {
		this(INITIAL_SIZE);
	}

	public GenericStack(int size) {
		elements = (T[]) new Object[size];
	}

	public T push(T value) {
		if (size >= elements.length) {
			T[] temp = (T[]) new Object[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);

			elements = temp;
		}
		return elements[size++] = value;
	}

	public T peek() {
		return elements[size - 1];
	}

	public T pop() {
		return elements[--size];
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
}