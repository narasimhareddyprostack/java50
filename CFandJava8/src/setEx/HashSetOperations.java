package setEx;

import java.util.HashSet;

public class HashSetOperations {
	public static void main(String[] args) {
	HashSet	setA=new HashSet<Integer>(100);
	setA.add(10);
	setA.add(20);
	setA.add(30);
	setA.add(40);
	HashSet	setB=new HashSet<Integer>(100);
	setB.add(30);
	setB.add(40);
	setB.add(50);
	setB.add(60);
	
	System.out.println(setA);
	System.out.println(setB);
	
	//union operation set  object
	//setA.addAll(setB);
	//System.out.println(setA);
	
	//intersection operation on set object
	//setA.retainAll(setB);
	//System.out.println(setA);
	
	//difference a-b
	//setA.removeAll(setB);
	//System.out.println(setA);
	
	//symetric difference
	boolean flag=setA.containsAll(setB);
	
	System.out.println(flag);
	
	}

}
