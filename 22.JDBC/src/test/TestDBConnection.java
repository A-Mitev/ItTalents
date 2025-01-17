package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class TestDBConnection {

	public static void main(String[] args) {

		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root",
					"root");

			Statement statement = connect.createStatement();
			

			String sqlInsert = "INSERT INTO `mydb`.`cart` (`ProductID`, `Broiki`, `CartID`)"
					+ " VALUES ('2', '20', '2')";

//			statement.executeUpdate(sqlInsert);
			
			ResultSet result = statement.executeQuery("select * from mydb.Cart");
//			ResultSetMetaData testResult = (ResultSetMetaData) result.getMetaData();
//			System.out.println(testResult);

			ResultSetMetaData collumnName = result.getMetaData();
			
			for (int index = 1; index <= 5; index++) {
				System.out.print(collumnName.getColumnName(index) + " ");
			}
			
			String foramt = "%s\t| %s\t| %s\t| %s";
			System.out.println(String.format(format, "ID", "AGE", "FIRST", "LAST"));
			
			
			System.out.println();
			while (result.next()) {
				System.out.println((result.getInt("ProductID")) +
						result.getInt("product") + result.getInt("Broiki")
						+ result.getInt("PurchasePrice") + result.getInt("CartID"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
