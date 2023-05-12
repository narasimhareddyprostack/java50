class Check{
    public static void main(String[] args) {

        //System.out.println(10/0);
        try {
             throw new ArithmeticException("/Zero");
        } catch (Exception e) {
           System.out.println(e);
        }
       

        System.out.println("GM");
        System.out.println("GA");
        System.out.println("GE");

    }
}