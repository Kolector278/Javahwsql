package COP2805;
import java.util.*;
import java.sql.*;
import java.io.*;
public class HwData {

	public static void main(String[] args) {
		Connection connection;
		try {
		     ResultSet results = null;
		     try {
		          Class.forName("com.mysql.cj.jdbc.Driver");
		    } catch (ClassNotFoundException e) {
		        e.printStackTrace();
		    }
		    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/homework_7", "root",
					"root");
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	}}
