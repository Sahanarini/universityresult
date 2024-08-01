package com.test.universityresult;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddStudentTest {
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void test() {
		driver.get("http://localhost:3000/create");
		driver.findElement(By.name("name")).sendKeys("mega");
		driver.findElement(By.name("dept")).sendKeys("cse");
		driver.findElement(By.name("subject")).sendKeys("phy");
		driver.findElement(By.name("result")).sendKeys("phy");
//		driver.findElement(By.name("lid")).click();
//		{
//			WebElement dropdown = driver.findElement(By.name("lid"));
//			dropdown.findElement(By.xpath("//option[. = '4']")).click();
//		}
		driver.findElement(By.id("submit")).submit();
	}
	

}
