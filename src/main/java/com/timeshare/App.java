package com.timeshare;

import com.timeshare.utils.mysql.EstablishConnection;

/**
 * Hello world!
 *
 */

//@SpringBootApplication
public class App {
    public static void main( String[] args ) {
        EstablishConnection establishConnection = new EstablishConnection();
        establishConnection.conn();

        //SpringApplication.run(App.class, args);
    }
}
