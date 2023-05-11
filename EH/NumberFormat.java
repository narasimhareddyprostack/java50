class Test{
    public static void main(String[] args) {
        int id;
        try{
            id = Integer.parseInt("Evening");
        }
        catch(Exception e){
            //System.out.println(e.getMessage());
            //e.printStackTrace();
            System.out.println(e.toString());
            id = Integer.parseInt("100");
        }
        System.out.println(id);
    }
}