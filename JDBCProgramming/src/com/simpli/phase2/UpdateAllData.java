package com.simpli.phase2;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Statement;

public class UpdateAllData {
	private static Connection con;
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		String url = "jdbc:mysql://localhost:3306/simpli_jdbc";
		String user = "root";
		String pwd = "root";
		con = DriverManager.getConnection(url, user, pwd);
		System.out.println("Connection established");
		String sql = "Update student set name= 'Rakshitha' ";
		
		Statement stmt = (Statement) con.createStatement();
		stmt.executeUpdate(sql);//insert,update,delete,create
		System.out.println("Update operation completed"); 
		stmt.close();
	con.close();

}
}