package COP2805;

import java.util.*;
import java.sql.*;
import java.io.*;

public class main {

	public static void main(String[] args) {
		ResultSet result = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/homework_7", "root",
					"root");
			Statement statement = connection.createStatement();
			result = statement.executeQuery("SELECT * FROM employees;");
			
			while (result.next()) {
				System.out.println(" ID:" + result.getInt( 1));
				System.out.println(" First Name:" + result.getString( 2));
				System.out.println(" Last Name:" + result.getString( 3));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			System.out.println("Hit");
		}

	}

}
