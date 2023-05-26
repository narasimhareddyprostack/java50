package fourconcepts;

interface CalcI{
	public abstract int sqrt(int i);
}
public class CalcImpl {
	/*
	public int sqrt(int i) {
		return i*i;
	}
	*/
	public static void main(String[] args) {
		//CalcI obj=(int i)->{return i*i;};
		CalcI  obj  = i -> i*i;
		System.out.println(obj.sqrt(10));
	}
}
