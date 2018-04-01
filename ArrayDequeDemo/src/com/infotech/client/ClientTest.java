package com.infotech.client;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ClientTest {

	public static void main(String[] args) {
		Deque<String> arrayDeque = new ArrayDeque<String>();
		arrayDeque.add("A");
		arrayDeque.add("B");
		arrayDeque.add("C");
		
		arrayDeque.offer("F");
		
		//arrayDeque.add(null);//Null elements are not allowed in the ArrayDeque.

		//offerFirst-adds elements at the front of the ArrayDeque
		arrayDeque.offerFirst("D");

		//offerLast inserts the element at the last of ArrayDeque
		arrayDeque.offerLast("E");

		Iterator<String> itr = arrayDeque.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("After poll");
		
		String s = arrayDeque.poll();
		System.out.println("Poll Item is:"+s);
		
		System.out.println("After polling an Item from arrayDeque::");
		
		for (String item : arrayDeque) {
			System.out.println(item);
		}
	}
}
