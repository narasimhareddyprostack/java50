class Parent{
        public void m1(){
            System.out.println("Parent class - m1() method");
        }
        public void m2(){
            System.out.println("Parent class - m2() method");
        }
}
class Child  extends Parent {
    public void m3(){
        System.out.println("Child class - m3() method");
    }
}
public class Test{
    public static void main(String[] args) {
           Parent a3=new Parent();
           a3.m1();
           a3.m2();
           //a3.m3();
     }
}