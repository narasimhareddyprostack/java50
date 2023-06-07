package com.hdfc.dbone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CRUDEx {

	public static void main(String[] args) {
		try {
				//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish connection
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/dbproduct", "root", "root");
			Statement st=con.createStatement();
			int count=st.executeUpdate("DELETE FROM employee WHERE id=3");
			
			System.out.println("deleted successfully" +count);
			
			ResultSet rs=st.executeQuery("select * from employee");
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("Salary");
				System.out.println("Employee Id:"+id + ": Employee Name:"+ name+": Salary"+sal);
			}
			
		}
		catch(Exception e) {
			
		}

	}

}
