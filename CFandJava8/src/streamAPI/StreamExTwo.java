package streamAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamExTwo {

	public static void main(String[] args) {
	List<Integer> numbers=new ArrayList<>();
	numbers.add(45);
	numbers.add(145);
	numbers.add(5456);
	numbers.add(452);
	numbers.add(845);
	numbers.add(4);
	numbers.add(5);
	
	List<Integer> evens=new ArrayList<>();
	Iterator itr =numbers.iterator();
	while(itr.hasNext()) {
		Integer i = (Integer) itr.next();
		if(i %2 ==0) {
			evens.add(i);
		}
	}
	/*
	List<Integer> evens = numbers.stream()
	       .filter(num->num % 2 ==0)
	       .collect(Collectors.toList());
	*/
	System.out.println(numbers);
	System.out.println(evens);

	}

}
