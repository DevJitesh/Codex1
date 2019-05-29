package org.kale.codex.pages;

import org.kale.codex.sdk.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BaseClass
{
	WebDriver driver;
	public LoginPage(WebDriver dr)
	{
		driver=dr;
	}
	
	public void login(String entity,String username, String password) throws InterruptedException
	{
		Select drpentity=new Select(driver.findElement(By.xpath(".//*[@id='drpEntity']")));
		drpentity.selectByVisibleText(entity);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='txtUsrName']")).sendKeys(username);		
		driver.findElement(By.xpath(".//*[@id='txtPswd']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='imgButton']")).click();
	} 
}
