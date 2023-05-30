package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements  Users{
    private Connection connection;

    public MySQLUsersDao(Config config) {
        try{
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(config.getURL(), config.getUSER(), config.getPASSWORD());
        } catch (SQLException e){
            throw new RuntimeException("Failed to connect to the database");
        }
    }

    @Override
    public User findByUsername(String username) {
        try{
            String sql = "SELECT * from users where username = ?";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, username);

            ResultSet rs = statement.executeQuery();
            rs.next();
            User newUser = new User(rs.getLong("id"), rs.getString("username"), rs.getString("email"), rs.getString("password"));
            return newUser;
        } catch (SQLException e){
            throw new RuntimeException("Failed to search for user");
        }
    }


    @Override
    public Long insert(User user) {
        try{
            PreparedStatement statement = connection.prepareStatement("INSERT INTO users(username, email, password) VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());

            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();

            rs.next();
            System.out.println("Added");
            return rs.getLong(1);
        } catch (SQLException e){
            throw new RuntimeException("Failed to insert ");
        }

    }
}
