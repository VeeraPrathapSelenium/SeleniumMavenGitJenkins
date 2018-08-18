package com.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTestCase {
		
	@Test
	
	
	public static void launchbrowser()
	{
		WebDriver driver=new FirefoxDriver();
		//Parent p=new Child ();
		
		
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		
		
	}

}
