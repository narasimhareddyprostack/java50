class Product{
    String prod_Name;
    double prod_Price;
    
    Product(String name,double price){
        this.prod_Name = name;
        this.prod_Price = price;
    }
    public static void main(String[] args) {
        Product p1=new Product("Iphone 12", 45000.00);
        Product p2=new Product("Iphone 13", 55000.00);

        System.out.println("******");
        System.out.println(p1.prod_Name);
        System.out.println(p1.prod_Price);

          System.out.println("******");
        System.out.println(p2.prod_Name);
        System.out.println(p2.prod_Price);
    }
}
