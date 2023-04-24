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
                Parent obj1= new Parent();
                Parent obj2=new Child(); //Parent can hold child
                Child obj3=new Child(); //Child can hold child
                Child obj4=new Parent(); //Child can not hold Parent
                //obj1.m1();
                //obj1.m2();
               /*  obj2.m1();
                obj2.m2();
                obj2.m3(); */
                
                /* obj3.m1();
                obj3.m2();
                obj3.m3();
 */
    }
}

/*
 * /*
            Parent obj1=new Parent();
            obj1.m1();
            obj1.m2();
            obj1.m3();m3 not available in Parent class
            * /
 */