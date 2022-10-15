package com.Demo;

import java.io.*;
import java.sql.*;

public class Runner {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/surge";
		String username = "root";
		String password = "root";
		String query = "select *from employee";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Start");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			String name = rs.getString("age");
			System.out.println(name);
		}
		st.close();
		con.close();

		System.out.println("Closed");

	}
}
