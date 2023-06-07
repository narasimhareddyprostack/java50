package jdbcone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadData {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbproduct","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from employee");
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int sal = rs.getInt("Salary");
			System.out.println("Employee Id:"+id + ": Employee Name:"+ name+": Salary"+sal);
		}
		

	}

}
