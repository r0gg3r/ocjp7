package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {

	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<>();
		stack.push("one");
		stack.push("three");
		stack.push("two");

		int size = stack.size() - 1;
		while (size >= 0) {
			System.out.println(stack.poll());
			size--;
		}
		while (size >= 0) {
			System.out.println(stack.poll());
			size--;
		}

	}

}
