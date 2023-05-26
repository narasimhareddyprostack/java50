package fourconcepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class TestCollection {
	static Predicate<Collection> p = c->c.isEmpty();
	/*
	public boolean test(Collection c){
			if(c.isEmpty()) {
				return true;
			}
			else {
				return false;
			}
	}
	*/
	
	public static void main(String[] args) {
		ArrayList al =new ArrayList();
		al.add(10);
		al.add(20);
		//TestCollection p = new TestCollection();
		System.out.println(p.test(al));
		
	}
}
