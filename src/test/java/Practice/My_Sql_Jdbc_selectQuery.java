package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class My_Sql_Jdbc_selectQuery {

	public static void main(String[] args) throws Throwable  {
		
		Connection conn=null; 
		//connection is an interface
		try {
			//register to the database
			
		Driver driverref=new Driver(); //MySql.cj package 
		DriverManager.registerDriver(driverref); //driver is an interface
		
		//get the connection
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/childrens", "root","root");
		//create the query
		
	Statement stat = conn.createStatement();//statement is an interface
	String query="select * from student";
	//execute the query
	ResultSet resultset = stat.executeQuery(query);// resultset is an  interface		
	while(resultset.next())
	{
		System.out.println(resultset.getString(1)+"\n"+resultset.getInt(2));
	}
		}
		catch(Exception e)
		{
			System.out.println("handling.....");
			e.printStackTrace();
		}
		finally {
			//close the connection
			conn.close();
		}
	}
	//register to the database
	//get the connection
	//write the query
	//execute the query
	//close the connection
}
