
public class GenericStack<T> {
	private Object[] stack;
	private int sp = 0;
	private int size = 10;

	public GenericStack() {
		stack = (T[]) new Object[size];
	}

	public void add(T t) {
		if (sp >= size) {
			increaseSize();
		}
		stack[sp] = t;
		sp++;
	}

	public void increaseSize() {
		Object[] temp = (T[]) new Object[size];
		for (int i = 0; i < size; i++) {
			temp[i] = stack[i];
		}
		size *= 2;
		stack = (T[]) new Object[size];
		for (int i = 0; i < size; i++) {
			stack[i] = temp[i];
		}

	}
}
