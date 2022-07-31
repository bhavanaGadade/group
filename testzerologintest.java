package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.ChromrBrowser;
import pom.Pomzerologin;
import utility.Excel;

public class testzerologintest {
	WebDriver driver;
	
	@BeforeMethod
	public void browser() {
		driver=ChromrBrowser.openBrowser();
	}
	
	@Test
	public void login1() throws EncryptedDocumentException, IOException, InterruptedException {
	Pomzerologin Pomzerologin1=new Pomzerologin(driver);
	String userId=Excel.getData("Credentials",0,0);
	Pomzerologin1. enteruserID(userId);
	
	Thread.sleep(2000);
	String password=Excel.getData("Credentials", 1, 0);
	Pomzerologin1.pass(password);
    Pomzerologin1.login();
	
	String pincode=Excel.getData("Credentials", 2, 0);
	Pomzerologin1.pincode1(pincode);
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	
	}
}
