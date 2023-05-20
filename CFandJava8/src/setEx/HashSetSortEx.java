package setEx;

import java.util.Collections;
import java.util.HashSet;

public class HashSetSortEx {
public static void main(String[] args) {
	HashSet<Integer>	setA=new HashSet<Integer>(100);
	setA.add(200);
	setA.add(20);
	setA.add(308);
	setA.add(4);
	System.out.println(setA);
	//Collections.sort(setA);
}
}
