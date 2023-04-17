package pack1;
public class A{

	public static void main(String[] args){
		new A().m1();
		System.out.println("main method");
	}
	public void m1(){
	System.out.println("Package - pack1: Class A - m1 method");
	}
}