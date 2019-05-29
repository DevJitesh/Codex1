package org.kale.codex.test;

import org.kale.codex.TestDataReaders.TestDataCollection;
import org.kale.codex.TestDataReaders.TestDataReader;
import org.kale.codex.TestDataReaders.TestDataReaderFactory;
import org.kale.codex.pages.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Codex_Login extends org.kale.codex.sdk.BaseClass
{
	String username;
	String password;
	String entity;
	
	@BeforeClass
	public void readData()
	{
		TestDataReader tdr=TestDataReaderFactory.getInstance().open("TestData\\user-accounts.yml");
		TestDataCollection tdc=tdr.getCollection("login_tester");	
		username=tdc.getString("username");
		password=tdc.getString("password");
	}	
	@Test
	public void Freightlogin() throws InterruptedException 
	{
		LoginPage lp=new LoginPage(driver);
		lp.login("Freight Forwarder",username, password);		
		
		
	}
}
