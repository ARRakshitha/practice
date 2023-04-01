package com.simpli.phase3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class SelectAll {
	private static Connection con;
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		String url = "jdbc:mysql://localhost:3306/simpli_jdbc";
		String user = "root";
		String pwd = "root";
		con = DriverManager.getConnection(url, user, pwd);
		System.out.println("Connection established");
		String sql = "select * from student ";
		Statement stmt = (Statement) con.createStatement();
		
		ResultSet res = stmt.executeQuery(sql);//set of results 
		
		System.out.println("Update operation completed"); 
		stmt.close();
	con.close();

}
}