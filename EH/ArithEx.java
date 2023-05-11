class ArithEx{
    public static void main(String[] args) {
        try{
            System.out.println(100/0);
        }
        catch(ArithmeticException ae){
            System.out.println(100/10);
        }
    }
}