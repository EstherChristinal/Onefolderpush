package org.face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA PROGRAMS\\TesProg\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtUserName =driver.findElement(By.id("email"));
		txtUserName.sendKeys("esther@gmail.com");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("hello");
		
				
	}
	

}
