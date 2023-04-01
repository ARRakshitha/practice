package com.simpli.phase2;

import java.sql.DriverManager;
import java.sql.SQLException;

public class BasicConnection {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		String url = "jdbc:mysql://localhost:3306/simpli_jdbc";
		String user = "root";
		String pwd  = "root";
		DriverManager.getConnection(url, user, pwd);
		System.out.println("Connection established");
	}
}
