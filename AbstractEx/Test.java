abstract class A{
    public void m1(){
        System.out.println("abstract class -A: m1()");
    }
    public abstract void m2();
}

class B extends A{
        public void m2(){
            System.out.println("Child class -B: m2()");
        }
}
public class Test{
public static void main(String[] args) {
           A obj=new B();
           obj.m1();
           obj.m2();
}
}