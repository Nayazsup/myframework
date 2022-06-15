package com.crm.comcast.GenericUtilities;


import java.util.Date;
import java.util.Random;

public class Java_Utilities {

	
	
	public int getRandnum() {
		
		Random rnum=new Random();
		int rnumb = rnum.nextInt(1000);
		return rnumb;
		
	}
	public String getData()
	{
		Date date=new Date();
		String currentdate = date.toString();
		System.out.println(currentdate);
	String[] arr = currentdate.split("");
	String yyyy=arr[5];
	String dd=arr[2];
	int mm = date.getMonth();
	String formate=dd+"-"+mm+"-"+yyyy;
	return formate;	
	}
}
