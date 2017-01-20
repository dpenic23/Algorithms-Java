package hr.dpenic23.algorithms.list;

import hr.dpenic23.algorithms.list.impl.LinkedList;
import hr.dpenic23.algorithms.list.impl.LinkedListNode;

/**
 * Finds all elements in a linked list between n-th and last position. If n is
 * negative than all elements are printed or if n is larger than the size of the
 * list than none of the elements are printed.
 * 
 * @author dpenic23
 *
 */
public class NthToLastElement {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);

		System.out.println(list);

		LinkedList reducedList = nthToLast(5, list);

		System.out.println(reducedList);

	}

	private static LinkedList nthToLast(int n, LinkedList list) {

		if (n <= 0) {
			return list.copy();
		}

		LinkedList reducedList = new LinkedList();

		LinkedListNode node = list.getHead();

		for (int i = 0; i < n; i++) {
			if (node == null) {
				return reducedList;
			} else {
				node = node.next;
			}
		}

		while (node != null) {
			reducedList.add(node.data);
			node = node.next;
		}

		return reducedList;

	}

}
