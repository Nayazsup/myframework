package com.crm.comcast.GenericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Database_Utilities {
	
	Connection conn;
	Statement statement;
	public void registerconnection() throws Throwable
	{
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref) ; 
	}
	
	public void getconnection(String url, String username, String password) throws Throwable
	{
		conn=DriverManager.getConnection(url, username,password);
	}
	
	public void createstatement() throws Throwable
	{   
		
		statement = conn.createStatement();
	}
	
	public void executequery(String query) throws Throwable
	{
		
		ResultSet result = statement.executeQuery(query);
	}
	
	public void closeconnection() throws Throwable
	{
		conn.close();
	}
	

}
