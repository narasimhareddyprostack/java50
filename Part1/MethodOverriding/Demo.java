class Parent{
    public final void m1(){
        System.out.println("Parent - m1()");
    }
}
class Child extends Parent{
    public void m1(){
        System.out.println("Child - m1()");
    }
}
public class Demo{
    public static void main(String[] args) {
        
        
         Parent a1=new Child();
         a1.m1();
    }
}