package pack1;

public class A{
     public  void m1(){
        System.out.println("Class A - m1() public method");
     }
     protected void m2(){
        System.out.println("Class A - m2() protected method");
     }
     private void m3(){
        System.out.println("Class A - m3() private method");
     }
     public static void main(String[] args) {
        A a1=new A();
        a1.m1();
        a1.m2();
        a1.m3();
     }
}