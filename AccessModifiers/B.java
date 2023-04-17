package pack1;

public class B{
    public static void main(String[] args) {
        A a1=new A();
        a1.m1();//public - m1
        a1.m2();//protected - m2()
        //a1.m3();//private - m3
    }
}