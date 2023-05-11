class Test{
    public static void main(String[] args) {
        int id;
        try{
            id = Integer.parseInt(args[0]);
        }
        catch(Exception e){
            id = Integer.parseInt("100");
        }
        System.out.println(id);
    }
}