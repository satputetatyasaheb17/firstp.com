package bank.management.System;

import java.sql.*;

public class connn {
    Connection connection;
    Statement statement;
    public connn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3305/bankSystem","root","djatmast@123");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
