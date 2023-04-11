class Test{
    public static void main(String[] args) {
        String[] enames={"Rahul","sonai","Priyanka","Modi","Naveen","Abhi"};
        int[] ids={101,102,103,104,105};
        double[] prices={9.9,99.9,199.9, 299.9,399.9};

        for(String ename:enames){
            System.out.println(ename);
        }
        System.out.println("Emp Ids");
        for(int id:ids){
                System.out.println(id);
        }
        System.out.println("***********Prices*****");

        for(double price:prices){
            System.out.println(price);
        }
        
    }
}