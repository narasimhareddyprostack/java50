class Test{
    public static void main(String[] args) {
        int[] ids={10,20,30};
        try {
            
            System.out.println(ids[2]);

        } catch (Exception e) {
            System.out.println(ids[1]);
        }
        finally{
            System.out.println("Always Exe");
        }
    }
}