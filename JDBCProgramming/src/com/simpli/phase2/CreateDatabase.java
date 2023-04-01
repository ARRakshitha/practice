package com.simpli.phase2;
import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.Statement;

public class CreateDatabase {
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
		String sql = "Create database simpli_check2";
		stmt = (Statement) con.createStatement();
		int x = stmt.executeUpdate(sql);//insert,update,delete,create
		if(x>0)
		{
			System.out.println("Database Created");}
		else 
		{
			System.out.println("Database not created");
		}
		stmt.close();
		con.close();
	}
}