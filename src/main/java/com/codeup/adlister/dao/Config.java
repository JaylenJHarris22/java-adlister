package com.codeup.adlister.dao;

public class Config {
    private String URL = "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false";
    private String USER = "jdbc";
    private String PASSWORD = "Password.123";

    public String getURL() {
        return URL;
    }

    public String getUSER() {
        return USER;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }
}
