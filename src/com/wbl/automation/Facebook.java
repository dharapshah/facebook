package com.wbl.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook {

	@Test
	public void homepage(){
     
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranav.shah\\workspace\\WebDriver\\resources\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.facebook.com/");
     
     
     driver.findElement(By.xpath(".//*[@id='u_0_9']")).sendKeys("Radha");
     driver.findElement(By.xpath(".//*[@id='u_0_b']")).sendKeys("Patel");
     driver.findElement(By.id("u_0_e")).sendKeys("");
     driver.findElement(By.id("u_0_l")).sendKeys("RadPat");
     Select Month = new Select (driver.findElement(By.id("month")));
     Month.selectByValue("11");
     Select Date = new Select (driver.findElement(By.id("day")));
     Date.selectByValue("25");
     Select Year = new Select (driver.findElement(By.id("year")));
     Year.selectByIndex(1990);
     driver.findElement(By.id("u_0_6")).click();
     driver.findElement(By.id("u_0_r")).click();
     
     
		
	}

}
