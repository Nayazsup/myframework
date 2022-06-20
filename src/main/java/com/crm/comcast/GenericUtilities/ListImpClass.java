package com.crm.comcast.GenericUtilities;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListImpClass implements ITestListener {

	public void onTestFailure(ITestResult result) {
Java_Utilities ju=new Java_Utilities();
		String testname=result.getTestName()+ju.getData();
		System.out.println(testname);
TakesScreenshot tss=(TakesScreenshot)Baseclass.sdriver;
		//EventFiringWebDriver edriver=new EventFiringWebDriver(Baseclass.sdriver);
//check difference
		File scr = tss.getScreenshotAs(OutputType.FILE);
		File dst=new File("./screenshot/"+testname+".png") ;
		try {
			FileUtils.copyFile(scr, dst);

		} catch (Exception e) {
			System.out.println("----------handled-----------");
		}

	}

}


