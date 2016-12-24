package hr.dpenic23.algorithms.list;

import hr.dpenic23.algorithms.list.impl.LinkedList;
import hr.dpenic23.algorithms.list.impl.LinkedListNode;

/**
 * Removes all duplicates from a given single linked list such that list
 * afterwards contains unique elements, without additional memory buffer. This
 * can be done using additional memory (set) in O(N) time complexity.
 * 
 * @author dpenic23
 *
 */
public class RemoveDuplicates {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add(3);
		list.add(2);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(3);

		System.out.println(list);

		removeDuplicates(list);
		System.out.println(list);

	}

	private static void removeDuplicates(LinkedList list) {

		LinkedListNode node = list.getHead();

		if (node == null) {
			return;
		}

		while (node != null && node.next != null) {
			LinkedListNode iter = node;

			while (iter.next != null) {
				if (iter.next.data == node.data) {
					iter.next = iter.next.next;
				} else {
					iter = iter.next;
				}
			}

			node = node.next;
		}

	}

}
