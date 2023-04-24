class Parent{
    public void m1(){
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
         Parent a1=new Parent();
         a1.m1();  //
         Child a2=new Child();
         a2.m1();
         Parent a3=new Child();
         a3.m1();
    }
}