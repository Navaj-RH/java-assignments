package com.te.javabasics.arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList();
		arrayList.add(1);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(70);
		System.out.println("normal method");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("advance for loop");
		for (Integer in : arrayList) {
			System.out.println(in);
		}
		System.out.println("in reverse direction");
		for (int i = arrayList.size() - 1; i >= 0; i--) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("using iterator");
		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("using listiterator");
		ListIterator<Integer> iterator2 = arrayList.listIterator(arrayList.size());
		while (iterator2.hasPrevious()) {
			System.out.println(iterator2.previous());
		}
		/* ArrayList al=Collections.synchronizedList(al)<Integer>; */
		System.out.println("-----------------------------------------");
		arrayList.forEach(all -> System.out.println(all));
	}
}
