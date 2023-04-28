class Parent{
    Parent(){
        System.out.println("Parent class Const");
    }
}
class Child extends Parent{
    Child(){
        //super();
        System.out.println("Child class Const");
    }
    public static void main(String[] args) {
        new Child();
    }
}
