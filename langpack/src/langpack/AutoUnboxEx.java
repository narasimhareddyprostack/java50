package langpack;

public class AutoUnboxEx {
	public static void main(String[] args) {
		double a = 45000.99;
		Double b = a; //autoboxing
		Double c = Double.valueOf(a);
		
		double salary = b;//unboxing
		double s = b.doubleValue();
		
		System.out.println(a);
		System.out.println(b.toString());
		System.out.println(c);
		System.out.println(salary);
		System.out.println(s);
		
	}
}
