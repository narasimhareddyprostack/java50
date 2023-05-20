package linkedListEx;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExThree {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(al);
		al.add(0,5);
		System.out.println(al);
		System.out.println(ll);
		ll.addFirst(5);
		ll.addLast(50);
		System.out.println(ll);
		
		
		
	}

}
