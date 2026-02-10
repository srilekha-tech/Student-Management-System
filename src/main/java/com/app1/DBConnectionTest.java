package com.app1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionTest {
		    public static void main(String[] args) {
		        try {
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            Connection con = DriverManager.getConnection(
		                "jdbc:mysql://localhost:3306/studentdb", "root", "root"
		            );
		            System.out.println("✅ Connection successful: " + con);
		        } catch (Exception e) {
		            System.out.println("❌ Connection failed:");
		            e.printStackTrace();
		        }
		    }
}
