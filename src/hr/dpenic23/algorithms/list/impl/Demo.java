package hr.dpenic23.algorithms.list.impl;

public class Demo {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add(2);
		list.add(-5);
		list.add(0);
		list.add(32);
		list.add(14);

		System.out.println(list);

		list.remove(0);

		System.out.println(list);

	}

}
