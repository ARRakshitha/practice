package com.simpli.phase2;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Statement;

public class DeleteAllData {
	private static Connection con;
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		String url = "jdbc:mysql://localhost:3306/simpli_jdbc";
		String user = "root";
		String pwd = "root";
		con = DriverManager.getConnection(url, user, pwd);
		System.out.println("Connection established");
		String sql = "delete from student";
		
		Statement stmt = (Statement) con.createStatement();
		stmt.executeUpdate(sql);//insert,update,delete,create
		System.out.println("Delete operation completed"); 
		stmt.close();
	con.close();

}
}
