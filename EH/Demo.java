class Demo{
    public static void main(String[] args) {
        methodOne();
    }


    public static void methodOne(){
    methodTwo();
    }
    public static void methodTwo(){
        try{
        main(new String[]{});
        }
        catch(Exception e){
            System.out.println(e);
        }
       
    }
    
    
    
    
}