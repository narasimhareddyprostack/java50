class Test{
    public static void main(String[] args) {
        
        String ename1 = "Rahul"; //string literal
        String ename2=new String("Rahul");//new object

        System.out.println(ename1); //Hello
        System.out.println(ename2);  //Hello
        
        
        System.out.println(ename1.equals(ename2));  
        System.out.println(ename1==ename2);  

    }
}