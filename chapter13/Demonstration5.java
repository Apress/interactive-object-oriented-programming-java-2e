package java2e.chapter13;
import java.sql.*;
import javax.sql.DataSource;
/*
The name of the class that implements java.sql.Driver in MySQL Connector/J has changed from 
com.mysql.jdbc.Driver to com.mysql.cj.jdbc.Driver. The old class name has been deprecated.
The names of these commonly-used classes and interfaces have also been changed.For example,
com.mysql.jdbc.jdbc2.optional is changed to com.mysql.cj.jdbc.MysqlDataSource
 */
import com.mysql.cj.jdbc.MysqlDataSource;

class Demonstration5 {
	static DataSource getMysqlDataSource() throws SQLException {
		MysqlDataSource mysqlDataSourceOb = null;
		mysqlDataSourceOb = new MysqlDataSource();
		mysqlDataSourceOb.setUrl("jdbc:mysql://localhost:3306/test");
		mysqlDataSourceOb.setUser("root");// Set user id.
		mysqlDataSourceOb.setPassword("admin"); // Set password
		return mysqlDataSourceOb;
	}

	public static void main(String[] args) throws SQLException {
		System.out.println("***Demonstration-5.Connecting to the MySql server using a DataSource object.***");
		Connection connectionOb = null;
		try {
			// for MySql database
			//Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			// connectionOb =
			// DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");
			connectionOb = getMysqlDataSource().getConnection();			
			//The following will also work if you do not supply username , password in getMysqlDataSource()
			connectionOb=getMysqlDataSource().getConnection( "root", "admin");
			Statement statementOb = connectionOb.createStatement();
			ResultSet queryResult = statementOb.executeQuery("select * from Employee");
			System.out.println(" EmployeeId\t" + "EmployeeName\t" + "Age\t" + "Salary");
			System.out.println("------------------------------------------");
			while (queryResult.next()) {
				System.out.print(queryResult.getString("EmpId") + "\t\t" + queryResult.getString("Name") + "\t\t"
						+ queryResult.getInt("Age") + "\t" + queryResult.getDouble("Salary"));
				System.out.println();
			}

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		// To catch any other exception
		catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		} finally {
			// Close the connection
			if (connectionOb != null) {
				connectionOb.close();
			}
		}
	}
}
