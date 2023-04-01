package com.simpli.phase2;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.Statement;

public class DropTable {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		String url = "jdbc:mysql://localhost:3306/simpli_jdbc";
		String user = "root";
		String pwd = "root";
		Connection con = DriverManager.getConnection(url, user, pwd);
		System.out.println("Connection established");
		String sql = "Drop table student";
		Statement stmt = (Statement) con.createStatement();
		int x = stmt.executeUpdate(sql);//insert,update,delete,create

		System.out.println("Drop Table");

		stmt.close();
		con.close();

	}
}

