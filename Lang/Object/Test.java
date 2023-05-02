import java.lang.Object;
class Test{
    public String m1(){
         System.out.println("Test Class m1() method");
         return "Hello, m1 method";
    }
    public String toString(){
        return "Rajinikanth";
    }
    public static void main(String[] args) {
         Test a=new Test();
         System.out.println(a.m1());
         System.out.println(a.toString());
         System.out.println(a);
    }
}