package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

import com.sun.swing.internal.plaf.synth.resources.synth;

public class TestQueue {

	static class PQSort implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}

	}

	public static void main(String[] args) {

		// 
		
		int[] ia = { 1, 5, 3, 7, 6, 9, 8 };
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();

		for (int i : ia) {
			pq1.offer(i);
		}

		System.out.println("size " + pq1.size());
		System.out.println("peek " + pq1.peek());
		System.out.println("size " + pq1.size());
		System.out.println("poll " + pq1.poll());
		System.out.println("poll " + pq1.poll());
		System.out.println("size " + pq1.size());
		
		System.out.println(" ****mostrando poll**** ");
		for (int i : ia) {
			System.out.println(pq1.poll() + "  ");
			//System.out.println(pq1.peek() + "  ");
		}
		
		System.out.println(" ****mostrando poll 2 **** ");
		for (int i : ia) {
			System.out.println(pq1.poll() + "  ");
			//System.out.println(pq1.peek() + "  ");
		}
		
		System.out.println("***personas****");
		
		System.out.println(" ***** TreeMap ***** ");
		Persona persona1 = new Persona(1L, "Juan");
		Persona persona2 = new Persona(2L, "Rosa");
		Persona persona3 = new Persona(3L, "Pedro");
		Persona persona4 = new Persona(4L, "Luis");
		
		PriorityQueue<Persona> pq3 = new PriorityQueue<Persona>();
		pq3.offer(persona1);
		pq3.offer(persona2);
		pq3.offer(persona3);
		pq3.offer(persona4);
		
		Persona []   arrPersonas = new Persona[pq3.size()];
		pq3.toArray(arrPersonas);
	
		for (Persona persona : arrPersonas) {
			System.out.println(" pq3 : "+ pq3.poll());
		}
		
//		for (Persona persona : pq3) {
//			
//			
//		}
		
		
		
	

		
		
//		System.out.println( " ordenados con comparator :");
//		PQSort pqs = new PQSort();
//		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(10,
//				new PQSort());
//		for (int i : ia) {
//			pq2.offer(i);
//		}
//
//		System.out.println("size " + pq2.size());
//		System.out.println("peek " + pq2.peek());
//		System.out.println("size " + pq2.size());
//		System.out.println("poll " + pq2.poll());
//		System.out.println("poll " + pq2.poll());
//		System.out.println("size " + pq2.size());
//
//		for (int x : ia) {
//			// review queue
//			System.out.println(pq2.poll() + " ");
//		}

	}

}
