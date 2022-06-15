package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class My_Sql_jdbc_noselect2 {
	
	public static void main(String[] args) {
		
		Connection connection;
		
		int result=0;
		try {
			//register to the database
			Driver refdriver=new Driver();
			DriverManager.registerDriver(refdriver);
			//get connection
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root","root");
			
			//create the query
			Statement statement = connection.createStatement();
			//String query="insert into demo values(3, 'nagu', 'hassan', 'india')";
			String query="drop customer";
			//execute the query
		    result = statement.executeUpdate(query);// resultset is an  interface		
			
			
		}
		catch(Exception e)
		{
			System.out.println("handled");
			e.printStackTrace();
		}
		finally{
			if(result==0)
			{
				//System.out.println("row is added successfully");
				System.out.println("table rename is successful");
				
			}else
			{
				//System.out.println("row is not added successfully");
				System.out.println("table rename is not successful");
			}
		}
	}


}
