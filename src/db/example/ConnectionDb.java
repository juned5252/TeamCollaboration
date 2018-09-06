package db.example;


import com.sun.xml.internal.bind.v2.model.core.ID;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class ConnectionDb {


    public static Connection connect = null;
    public static Statement statement = null;
    public static PreparedStatement ps = null;
    public static ResultSet resultSet = null;

    public static Properties loadProperties() throws IOException {
        Properties prop = new Properties();
        InputStream ism = new FileInputStream("src/secret.properties");
        prop.load(ism);
        ism.close();
        return prop;
    }

    public static Connection connectToMySql() throws Exception {
        Properties prop = loadProperties();
        String driverClass = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String userName = prop.getProperty("MYSQLJDBC.userName");
        String password = prop.getProperty("MYSQLJDBC.password");
        Class.forName(driverClass);
        connect = DriverManager.getConnection(url, userName, password);
        System.out.println("Database is connected");
        return connect;
    }


    public static void main(String[] args) throws Exception {

        Connection mycon=connectToMySql();
        statement=mycon.createStatement();
        resultSet=statement.executeQuery("Select * from Students");
        System.out.println(connect.isClosed());

        while (resultSet.next()){
            System.out.println( resultSet.getString("Id")+resultSet.getString(2));

            //i
        }


    }

}


