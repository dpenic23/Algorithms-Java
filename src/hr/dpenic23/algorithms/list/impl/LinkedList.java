package hr.dpenic23.algorithms.list.impl;

public class LinkedList {

	private LinkedListNode head;

	public LinkedList() {
	}

	public LinkedListNode getHead() {
		return head;
	}

	public void add(int data) {
		LinkedListNode node = new LinkedListNode(data, null);

		if (head == null) {
			head = node;
			return;
		}

		LinkedListNode tmp = head;
		while (tmp.next != null) {
			tmp = tmp.next;
		}

		tmp.next = node;

	}

	public void remove(int data) {
		LinkedListNode tmp = head;
		LinkedListNode prev = null;

		while (tmp != null && tmp.data != data) {
			prev = tmp;
			tmp = tmp.next;
		}

		if (tmp == null) {
			return;
		}

		if (prev == null) {
			// First element is to be removed
			head = tmp.next;
		} else {
			prev.next = tmp.next;
		}

	}

	@Override
	public String toString() {

		if (head == null) {
			return "";
		}

		StringBuilder sb = new StringBuilder();

		sb.append(head.data);

		LinkedListNode tmp = head.next;
		while (tmp != null) {
			sb.append(" " + tmp.data);
			tmp = tmp.next;
		}

		return sb.toString();

	}

}
