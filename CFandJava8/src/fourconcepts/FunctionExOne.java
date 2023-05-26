package fourconcepts;

import java.util.function.Function;

interface FunctionI{
	public abstract int apply(String name);
}

public class FunctionExOne implements FunctionI {
	
	public int apply(String name){
		return name.length();
	}
	public static void main(String[] args) {
		//Function<String, Integer> f = (String name)->{return  name.length();};
		Function<String, Integer> f = name -> name.length();
		//FunctionI f = new FunctionExOne();
		System.out.println(f.apply("Rahul"));
	}
}
