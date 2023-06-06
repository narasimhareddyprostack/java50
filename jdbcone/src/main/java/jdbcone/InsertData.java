package jdbcone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbproduct","root","root");
			Statement st=con.createStatement();
			st.executeUpdate("insert into employee values(101, 'Rahul', 45000)");
			st.executeUpdate("insert into employee values(102, 'Sonai', 55000)");
			st.executeUpdate("insert into employee values(103, 'Priya', 65000)");
			System.out.println("Data Inserted Successfully");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
