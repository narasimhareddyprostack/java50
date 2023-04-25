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
                   Child a1=new Child();
              //Ref Type
              a1.m1();
              a1.m2();
              a1.m3(); 
     }
}