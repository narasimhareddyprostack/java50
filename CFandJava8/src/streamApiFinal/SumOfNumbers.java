package streamApiFinal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,6,7,8,9,10);
		Optional<Integer> total =list.stream().reduce((a,b)->a+b);
		System.out.println(total.get());
		/*
		int total =0;
		for(Integer value:list) {
			total = total+value;
		}
		System.out.println(total);
		*/
	}
}
