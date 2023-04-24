class Test{
    public static void display_EmployeeIds(int[] ids){
            //System.out.println(ids);
            for(int id:ids){
                System.out.println(id);
            }
    }
    public static void main(String[] args) {
        display_EmployeeIds(new int[10]{101,102,103,104});
    }
}