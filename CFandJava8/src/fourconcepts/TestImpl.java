package fourconcepts;

import java.util.function.Predicate;

interface TestI{
	public abstract boolean test(int i);
}
public class TestImpl implements TestI {
	
	public boolean test(int i) {
		if(i>1000) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		  TestI t1 = new TestImpl();
		//Predicate<Integer> t1 = i-> i>1000;
		System.out.println(t1.test(1500));
	}

	
}
