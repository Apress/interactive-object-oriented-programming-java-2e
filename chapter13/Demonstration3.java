package java2e.chapter13;
import java.sql.*;

public class Demonstration3 {

	public static void main(String[] args) throws SQLException {
		System.out.println("***Demonstration-3.Use of PreparedStatement.***");
		Connection connectionOb = null;
		try {
			// for MySql database
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			connectionOb = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");
			Statement statementOb = connectionOb.createStatement();			
			System.out.println("Here is the initial table.");
			ResultSet queryResult = statementOb.executeQuery("select * from Employee");
			
			
			System.out.println(" EmployeeId\t" + "EmployeeName\t" + "Age\t" + "Salary");
			System.out.println("------------------------------------------");
			while (queryResult.next()) {
				System.out.print(queryResult.getString("EmpId") + "\t\t" + queryResult.getString("Name") + "\t\t"
						+ queryResult.getInt("Age") + "\t" + queryResult.getDouble("Salary"));
				System.out.println();
			}
			
			//Insering a new record in the table
			System.out.println("\nInserting a new record into the Employee table.");
			PreparedStatement preparedStatementOb=null;
			preparedStatementOb=connectionOb.prepareStatement("insert into Employee values(?,?,?,?)");
			preparedStatementOb.setInt(1,4);
			preparedStatementOb.setString(2,"Ivan");
			preparedStatementOb.setInt(3,27);
			preparedStatementOb.setDouble(4,975.6);
			preparedStatementOb.executeUpdate();
			System.out.println("**Here is the updated table.**");
			queryResult = statementOb.executeQuery("select * from Employee");
			System.out.println(" EmployeeId\t" + "EmployeeName\t" + "Age\t" + "Salary");
			System.out.println("------------------------------------------");
			while (queryResult.next()) {
				System.out.print(queryResult.getString("EmpId") + "\t\t" + queryResult.getString("Name") + "\t\t"
						+ queryResult.getInt("Age") + "\t" + queryResult.getDouble("Salary"));
				System.out.println();
			}
			//Deleting a record from the Employee table and setting the initial values again in the Employee table.
			System.out.println("\nDeleting the record of Ivan from the Employee table.");
			statementOb.executeUpdate("delete from employee where name='Ivan' ");			
					
			System.out.println("After the deletion of Ivan's record,here is the updated table.**");
			queryResult = statementOb.executeQuery("select * from Employee");
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
