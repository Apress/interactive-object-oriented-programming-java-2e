package java2e.chapter13;

import java.sql.*;

class Demonstration2 {

	public static void main(String[] args) throws SQLException {
		System.out.println("***Demonstration-2.Connecting to the MySql server.***");
		Connection connectionOb = null;
		try {
			// for MySql database
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			connectionOb = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");
			Statement statementOb = connectionOb.createStatement();
			System.out.println("Here is the initial table");
			ResultSet queryResult = statementOb.executeQuery("select * from Employee");
			System.out.println(" EmployeeId\t" + "EmployeeName\t" + "Age\t" + "Salary");
			System.out.println("------------------------------------------");
			while (queryResult.next()) {
				System.out.print(queryResult.getString("EmpId") + "\t\t" + queryResult.getString("Name") + "\t\t"
						+ queryResult.getInt("Age") + "\t" + queryResult.getDouble("Salary"));
				System.out.println();
			}
			//Updating 2 records and insering a new record.
			System.out.println("Updating Amit's age as 35.");
			statementOb.executeUpdate("update Employee set Age=35 where name='Amit' ");

			System.out.println("Updating Bob's salary to 2000.25");
			statementOb.executeUpdate("update Employee set Salary=2000.25 where name='Bob' ");
			System.out.println("Inserting a new record into the Employee table\n");
			statementOb.executeUpdate("insert into Employee values(4,'John',27,975)");

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
			System.out.println("\nDeleting the record of John from the Employee table.");
			statementOb.executeUpdate("delete from employee where name='John' ");			
			System.out.println("Updating Amit's age as 25 again.");
			statementOb.executeUpdate("update Employee set Age=25 where name='Amit' ");
			System.out.println("Updating Bob's salary to 1500.0 again.");
			statementOb.executeUpdate("update Employee set Salary=1500.0 where name='Bob' ");
			
			System.out.println("\n**Here is the updated table.**");
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
