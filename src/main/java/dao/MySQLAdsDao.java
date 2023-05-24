package dao;

import com.mysql.cj.jdbc.Driver;
import dao.Ads;
import models.Ad;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao(Config config){
        try{
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(config.getURL(), config.getUSER(), config.getPASSWORD());
        } catch (Exception e){
            System.out.println("Failed to connect to the database.");
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("Select * from ads");
            while (rs.next()){
                System.out.println(rs.getLong("id"));
                System.out.println(rs.getLong("user_id"));
                System.out.println(rs.getString("title"));
                System.out.println(rs.getString("description"));
                ads.add(new Ad(rs.getLong("id"), rs.getLong("user_id"), rs.getString("title"), rs.getString("description")));
            }
            return ads;
        } catch(
                SQLException e){
            throw new RuntimeException("Failed to access records");
        }
    }

    @Override
//    public Long insert(models.Ad ad) {
//
//        try{
//            Statement statement = connection.createStatement();
//
//            String query = String.format("Insert into ads(user_id, title, description) Values('%s', '%s', '%s')", ad.getUserId(), ad.getTitle(), ad.getDescription());
//            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
//            ResultSet rs = statement.getGeneratedKeys();
//            if(rs.next()){
//                System.out.println("insert id" + rs.getLong(1));
//            }
//
//            return rs.getLong(1);
//        } catch (SQLException e){
//            throw new RuntimeException("Failed to insert data");
//        }
//    }
    public Long insert(Ad ad) {
        try {
            Statement stm = connection.createStatement();
            String insertQuery = String.format("INSERT INTO ads (user_id, title, description) VALUES('%s', '%s', '%s')", ad.getUserId(), ad.getTitle(), ad.getDescription());
            stm.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stm.getGeneratedKeys();
            if (rs.next()) {
                System.out.println("insert id " + rs.getLong(1));
            }
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error adding ad");
        }
    }
}
