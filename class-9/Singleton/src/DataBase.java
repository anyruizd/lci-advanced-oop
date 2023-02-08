public class DataBase {
    private static DataBase databaseObj;
    private DataBase(){};

    public static DataBase getInstance(){
        if(databaseObj == null) {
            databaseObj = new DataBase();
        }
        return databaseObj;
    }

    public void getDataBase() {
        System.out.println("Your connection is ok! :D");
    }
}
