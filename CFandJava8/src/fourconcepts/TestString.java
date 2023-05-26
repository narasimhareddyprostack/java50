package fourconcepts;

import java.util.function.Predicate;

interface TestInferface{
	public abstract boolean test(String s);
}
public class TestString implements TestInferface{
	//static Predicate<String> p = (String s)->{ return s.length() > 4; };
	//static Predicate<String> p = s -> s.length()>4;
	
	public boolean test(String s){
		if(s.length()> 5) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		String name = "Rahul Gandhi";
		
		//TestInferface p = new TestString();
		Predicate<String> p = s-> s.length()>5;
		System.out.println(p.test(name));
	}
}
