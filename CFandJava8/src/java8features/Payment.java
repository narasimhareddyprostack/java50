package java8features;

public interface Payment {
	public abstract void m1();
	void m2();
	default void m3() {
		System.out.println("payment interface default method");
	}
}
