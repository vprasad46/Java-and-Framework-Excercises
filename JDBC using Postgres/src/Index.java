

/*

The Database is created using CREATE DATABASE employees;

The Table Registration contains

id(Primary Key- Integer)|| First(varchar(255)) || Last(varChar(255)) || Age(int)

*/

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Index {
	
	static final String DB_USR = "postgres";
	static final String DB_PASS = "password";

	public static void main(String args[]) {
		boolean ch = true;
		int i=1;
		PreparedStatement p = null;
		Statement s = null;
		Scanner input = new Scanner(System.in);
		// class for name this statement is to include the driver into the memory(classLoader)
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found!!. Please Re-check the lib folder");
		}
		//Getting a connection using DriverManager Class
		try (Connection c = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/employees",DB_USR,DB_PASS);){
			 String sql = "INSERT INTO REGISTRATION (id,first,last,age) "+
					 		"VALUES(?,?,?,?)"; 
			 while(ch){
				  p = c.prepareStatement(sql);
				 System.out.println("Enter id of the employee "+(i++));
				 p.setInt(1, input.nextInt());
				 System.out.println("Enter first name of the employee "+(i-1));
				 p.setString(2, input.next());
				 System.out.println("Enter last name of the employee "+(i-1));
				 p.setString(3, input.next());
				 System.out.println("Enter age of the employee "+(i-1));
				 p.setInt(4,input.nextInt());
				 
				 p.executeUpdate();
				 System.out.println("::Successfully inserterd records into the Database::");
				 System.out.println("1. Insert more 2.Exit");
				 int cho = input.nextInt();
				 if(cho != 1){
					 ch = false;
					  s = c.createStatement();
					 String sq = "SELECT * from registration";
					 ResultSet rs = s.executeQuery(sq);
					 while(rs.next()){
						 System.out.print("ID: "+rs.getInt("id")+" ");
						 System.out.print("First Name: "+rs.getString("first")+" ");
						 System.out.print("Last Name: "+rs.getString("last")+" ");
						 System.out.println("Age: "+rs.getInt("age"));
					 }
				 }
			 }
		} catch (SQLException e) {	
			System.out.println("Re-check the Database credentials and try again!!");
		}
		finally{
				if(p!=null){
					try {
						p.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				else if(s!=null){
					try {
						s.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
		}
	}
}