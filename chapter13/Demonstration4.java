package java2e.chapter13;
import java.sql.*;

class Demonstration4 {
	public static void main(String[] args) throws SQLException {
		System.out.println("***Demonstration-4.Using a Callable Statement.***");
		Connection connectionOb = null;
		try {
			// for MySQL database
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			connectionOb = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");
			Statement statementOb = connectionOb.createStatement();
			System.out.println("This is the original table.");
			ResultSet queryResult = statementOb.executeQuery("select * from NumberTable");
			System.out.println("FirstNumber \t" + "SecondNumber");
			System.out.println("--------------------------");
			while (queryResult.next()) {
				System.out.print(queryResult.getDouble("FirstNo") + "\t\t" + queryResult.getString("SecondNo"));
				System.out.println();
			}
			System.out.println("\nCalling the total() function on each record of the NumberTable.");
			//Using the Callable statement
			CallableStatement callableStmt=connectionOb.prepareCall("{?= call total(?,?)}"); 
			queryResult = statementOb.executeQuery("select * from NumberTable");
			System.out.println("FirstNumber \t" + "SecondNumber\t"+"Total");
			System.out.println("--------------------------------------");
			while (queryResult.next()) {
				System.out.print(queryResult.getDouble("FirstNo") + "\t\t" + queryResult.getDouble("SecondNo")+ "\t\t");				
				callableStmt.setDouble(2,queryResult.getDouble("FirstNo"));  
				callableStmt.setDouble(3,queryResult.getDouble("SecondNo")); 
				/*Here, we have used the registerOutParameter method of CallableStatement interface which 
				registers the OUT parameter in ordinal position parameterIndex(first argument) to the JDBC type sqlType(second argument). 
				All OUT parameters must be registered before a stored procedure is executed.*/
				callableStmt.registerOutParameter (1,Types.DOUBLE);
				callableStmt.execute();
				System.out.print(callableStmt.getDouble(1));
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