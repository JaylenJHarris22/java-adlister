package dao;

public class DaoFactory {
    private static NationalParkDao nationalParkDao;

    public static NationalParkDao getNationalParkDao(){
        if (nationalParkDao == null){
            nationalParkDao = new ListParks();
        }
        return nationalParkDao;
    }
}
