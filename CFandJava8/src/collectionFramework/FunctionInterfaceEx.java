package collectionFramework;

import java.util.function.Function;

public class FunctionInterfaceEx {
	static Function<Integer, Integer> f = (Integer i)->{return i*i;};
	public static void main(String[] args) {
		
		System.out.println(f.apply(10));
	}
}
