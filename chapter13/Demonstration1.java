package java2e.chapter13;

import java.sql.*;

class Demonstration1 {
	public static void main(String[] args) throws SQLException {
		System.out.println("***Demonstration-1.Connecting to the MySql server.***");
		Connection connectionOb = null;
		try {
			// for MySql database
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			connectionOb = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");
			Statement statementOb = connectionOb.createStatement();
			ResultSet queryResult = statementOb.executeQuery("select * from Employee");
			System.out.println(" EmployeeId\t" + "EmployeeName\t" + "Age\t" + "Salary");
			System.out.println("------------------------------------------");
			while (queryResult.next()) {
				System.out.print(queryResult.getString("EmpId") + "\t\t" + queryResult.getString("Name") + "\t\t"
						+ queryResult.getInt("Age") + "\t" + queryResult.getDouble("Salary"));
				System.out.println();
			}
			/*
			//For Q&A 13.6
			statementOb.addBatch("insert into Employee values(4,'Ivan',27,975.6)");  
			statementOb.addBatch("insert into Employee values(5,'Jacklin',29,575.5)");  
			//Batch execution
			statementOb.executeBatch();
			System.out.println("After the batch process:");
			queryResult = statementOb.executeQuery("select * from Employee");
			System.out.println(" EmployeeId\t" + "EmployeeName\t" + "Age\t" + "Salary");
			System.out.println("------------------------------------------");
			while (queryResult.next()) {
				System.out.print(queryResult.getString("EmpId") + "\t\t" + queryResult.getString("Name") + "\t\t"
						+ queryResult.getInt("Age") + "\t" + queryResult.getDouble("Salary"));
				System.out.println();
			}
				//Now deleting the records  from the Employee table
			   //and reseting the original state of Employee table.
				System.out.println("\nDeleting the record of Ivan and Jacklin from the Employee table.");				
				statementOb.addBatch("delete from employee where name='Ivan' ");  
				statementOb.addBatch("delete from employee where name='Jacklin' ");  
				//Batch execution
				statementOb.executeBatch();
				
				System.out.println("After the deletion operations:");
				queryResult = statementOb.executeQuery("select * from Employee");
				System.out.println(" EmployeeId\t" + "EmployeeName\t" + "Age\t" + "Salary");
				System.out.println("------------------------------------------");
				while (queryResult.next()) {
					System.out.print(queryResult.getString("EmpId") + "\t\t" + queryResult.getString("Name") + "\t\t"
							+ queryResult.getInt("Age") + "\t" + queryResult.getDouble("Salary"));
					System.out.println();
				}
				*/
			
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
