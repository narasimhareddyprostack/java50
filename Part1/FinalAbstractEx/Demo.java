class A{
        public  void m1(){
            System.out.println("A - m1() method");
        }
}
class B extends A{
    public  void m1(){
        System.out.println("B - m1() method");
        }
}
public class Demo(){
    public static void main(String[] args) {
        B obj=new B();
        obj.m1();
    }
}