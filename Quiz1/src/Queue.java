/**
 * 
 * @author mpafit02
 * Marios Pafitis 911719
 *
 */
public class Queue {

	private int arr[];
	private int count;

	// Getters
	public int[] getArr() {
		return arr;
	}

	public int getCount() {
		return count;
	}

	// Constructors
	public Queue() {
		arr = new int[8];
		count = 0;
	}

	public Queue(Queue q) {
		arr = new int[q.getArr().length];
		count = q.getCount();
		for (int i = 0; i < count; i++) {
			arr[i] = q.getArr()[i];
		}
	}

	// Methods
	private void increaseSize() {
		if (count == arr.length - 1) {
			int[] temp = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				temp[i] = arr[i];
			}
			arr = new int[temp.length * 2];
			for (int i = 0; i < temp.length; i++) {
				arr[i] = temp[i];
			}
		}
	}

	public void enqueue(int v) {
		increaseSize();
		arr[count] = v;
		count++;
	}

	public int dequeue() {
		int element = arr[0];
		for (int i = 0; i < count - 1; i++) {
			arr[i] = arr[i + 1];
		}
		count--;
		return element;
	}

	public boolean empty() {
		if (count == 0) {
			return true;
		}
		return false;
	}

	public int getSize() {
		return count;
	}
}
