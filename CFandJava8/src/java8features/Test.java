package java8features;
interface TestInterf{
		public	static void m1(){
				System.out.println("Interface - static method");
		}
}
public class Test implements TestInterf {
	public static void main(String[] args) {
		Test obj=new Test();
		//obj.m1();
		TestInterf.m1();
	}
}
