class Parent{
    String parent_Name;
    Parent(String name){
        System.out.println("Parent Class Const");
        this.parent_Name=name;
    }

}
class Child extends Parent{
    String child_Name;
    Child(String cName,String pName){
        super(pName);
        this.child_Name=cName;
    }

}
public class SuperDemo{
    public static void main(String[] args) {
        Child c1=new Child("Rahul","Rajiv");

        System.out.println(c1.parent_Name);
        System.out.println(c1.child_Name);

    }
}