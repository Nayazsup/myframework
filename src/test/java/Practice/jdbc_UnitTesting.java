package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//this script is about - to check project is present in db
import com.mysql.cj.jdbc.Driver;

public class jdbc_UnitTesting {

	public static void main(String[] args) throws Throwable {
		String projectname="apple";
		Connection conn=null;
		try {
			//register the connection
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref) ; 
		//get the connection
		                                                             //db name 
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root","root");
		System.out.println("connection is done");
		//write the query
		Statement statement = conn.createStatement();
		                          //table name
		String query="select * from projects";
		//execute the query
		ResultSet result = statement.executeQuery(query);
		
		while(result.next())
		{
			String actpname = result.getString(2);
		
		if(projectname.equals(actpname))
		{                                
			System.out.println("project is present");
		}
		}
		
		}catch(Exception e)
		{
			System.out.println("handled");
		}
		finally {
			//close connection
			conn.close();
			System.out.println("close db connection");
		}
		

	}

}
