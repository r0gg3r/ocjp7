package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TestQueue {

	static class PQSort implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {

			return o2 - o1;
		}

	}

	public static void main(String[] args) {

		int[] ia = { 1, 5, 3, 7, 6, 9, 8 };
		PriorityQueue<Integer> pq1 = new PriorityQueue<>();

		for (int i : ia) {
			pq1.offer(i);
		}

		for (int i : ia) {
			System.out.println(pq1.poll() + "  ");
		}

		PQSort pqs = new PQSort();

		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(10,
				new PQSort());
		for (int i : ia) {
			pq2.offer(i);
		}

		System.out.println("size " + pq2.size());
		System.out.println("peek " + pq2.peek());
		System.out.println("size " + pq2.size());
		System.out.println("poll " + pq2.poll());
		System.out.println("poll " + pq2.poll());
		System.out.println("size " + pq2.size());

		for (int x : ia) {
			// review queue
			System.out.print(pq2.poll() + " ");
		}

	}

}
