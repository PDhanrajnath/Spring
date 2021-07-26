package com.spring.hibernate.jdbc.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc {

    public static void main(String[] args){

        String jdbcurl="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
        String user="hbstudent";
        String pswrd="hbstudent";
        try {
            System.out.println("Connecting to database ... ");
            System.out.println(jdbcurl);
            Connection myConn= DriverManager.getConnection(jdbcurl,user,pswrd);
            System.out.println("Connection Successful!!");
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
