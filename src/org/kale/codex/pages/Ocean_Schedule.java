package org.kale.codex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ocean_Schedule
{
	
	WebDriver driver;

	public Ocean_Schedule(WebDriver dr)
	{
		driver=dr;
	}
	
	public void pricing() throws InterruptedException
	{
		 WebDriverWait wait=new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//*[@id='ctl00_hldPage_drpCountry']"))));
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//img[@title='Pricing']/..//a[contains(text(),'Pricing')]")).click();
			 
	}
}
