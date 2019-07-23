public class GenericStackList {
	static class GenericStack<T> extends java.util.ArrayList<T> {

		@Override
		public String toString() {
			return "Stack " + super.toString();
		}

		private static final long serialVersionUID = 1L;

		public Object push(T value) {
			return add(value);
		}

		public Object peek() {
			return get(getSize() - 1);
		}

		public Object pop() {
			return remove(getSize() - 1);
		}

		public int getSize() {
			return size();
		}

		public boolean isEmpty() {
			return super.isEmpty();
		}

		public int search(Object o) {
			return indexOf(o);
		}
	}

	public static void main(String args[]) {
		GenericStack<String> gc = new GenericStack<>();
		gc.push("Goerge");
		gc.push("Maria");
		gc.push("Kostas");
		System.out.println(gc.peek());
		System.out.println(gc.peek());
		System.out.println(gc.pop());
		System.out.println(gc.peek());
		System.out.println(gc.pop());
		System.out.println(gc.pop());
	}
}