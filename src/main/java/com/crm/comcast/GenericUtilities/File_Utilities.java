package com.crm.comcast.GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class File_Utilities {

	public String getvalue(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./data/comman.properties");
		Properties pro=new Properties();
		pro.load(fis);
		 String value = pro.getProperty(key);
		 return value;
		
	}
}
