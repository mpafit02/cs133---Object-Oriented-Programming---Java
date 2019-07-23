/**
 * 
 * @author mpafit02
 * Marios Pafitis 911719
 *
 */
public class QueueTest {
	public static void main(String[] args) {
		Queue queue = new Queue();
		for (int i = 0; i <= 20; i++)
			queue.enqueue(i);

		Queue queueC = new Queue(queue);

		while (!queue.empty())
			System.out.print(queue.dequeue() + " ");
		
		System.out.println();
		
		while (!queueC.empty())
			System.out.print(queueC.dequeue() + " ");
	}
}
