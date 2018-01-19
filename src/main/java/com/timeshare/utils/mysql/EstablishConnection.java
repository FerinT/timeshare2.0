package com.timeshare.utils.mysql;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by tayfer01 on 1/18/2018.
 */
public class EstablishConnection {

    private Connection connection;

    public Connection conn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/timeshare", "root", "");
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }
}


