package genericsEx;

class CustomGeneric<T>{

	T obj;
	void set(T obj){
		  this.obj = obj;
	}
	T get(){
		return obj;
	}
	
}

public class TestGenerics {

	public static void main(String[] args) {
		CustomGeneric<Integer>	obj1=new CustomGeneric<Integer>();
		CustomGeneric<String>	obj2=new CustomGeneric<String>();
		obj1.set(100);
		System.out.println(obj1.get());
		obj2.set("Rahul");
		System.out.println(obj2.get());
		
		CustomGeneric	obj3=new CustomGeneric();
		obj3.set(500.5);
		
		System.out.println(obj3.get());
		obj3.set("Rahul2");
	}

}
