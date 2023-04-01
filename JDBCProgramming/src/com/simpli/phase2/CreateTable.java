package com.simpli.phase2;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Statement;

public class CreateTable {
	private static Connection con;
	private static Statement stmt;
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		String url = "jdbc:mysql://localhost:3306/simpli_jdbc";
		String user = "root";
		String pwd = "root";
		con = DriverManager.getConnection(url, user, pwd);
		System.out.println("Connection established");
		String sql = "Create table Student (name varchar(20), id int)";
		stmt = (Statement) con.createStatement();

		stmt.executeUpdate(sql);//insert,update,delete,create

		System.out.println("Table Created");

		stmt.close();
		con.close();
	}
}