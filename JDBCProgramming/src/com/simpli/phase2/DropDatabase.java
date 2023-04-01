package com.simpli.phase2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DropDatabase {
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
		String sql = "Drop database simpli_check1";
		Statement stmt = (Statement) con.createStatement();
		int x = stmt.executeUpdate(sql);//insert,update,delete,create

		System.out.println("Table Created");

		stmt.close();
		con.close();

	}
}
