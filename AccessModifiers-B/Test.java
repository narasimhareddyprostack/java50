class Parent{
    public void m1(){
        System.out.println("Parent Class m1() method");
    }
    public void m2(){
    System.out.println("Parent Class m2() method");
    }
}
class Child extends Parent{
    public void m3(){
    System.out.println("Child Class m3() method");
    }
    
}
public class Test{
    public static void main(String[] args) {
            Child  a1=new Child();  
            Parent a2=new Parent();
            Parent a3=new Child();
            a3.m1();
            a3.m2();
            a3.m3();
    }
}

