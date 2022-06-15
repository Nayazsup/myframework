package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class My_sql_jdbc_noselect {
	
	public static void main(String[] args) {
		
		Connection connection;
		
		int result=0;
		try {
			//register to the database
			Driver refdriver=new Driver();
			DriverManager.registerDriver(refdriver);
			//get connection
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/childrens", "root","root");
			
			//create the query
			Statement statement = connection.createStatement();
			String query="insert into student values(7, 'nag', 'ahmed', 'h')";
			
			//execute the query
		    result = statement.executeUpdate(query);// resultset is an  interface		
			
			
		}
		catch(Exception e)
		{
			System.out.println("handled");
			e.printStackTrace();
		}
		finally{
			if(result==1)
			{
				System.out.println("row is added successfully");
				
			}else
			{
				System.out.println("row is not added successfully");
			}
		}
	}

}
