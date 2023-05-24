package java8features;

public class TestTwo implements Payment {

	@Override
	public void m1() {
		System.out.println("m1 method");

	}

	@Override
	public void m2() {
		System.out.println("m2 method");

	}
	public static void main(String[] args) {
		TestTwo obj=new TestTwo();
		obj.m1();
		obj.m2();
	}

}
