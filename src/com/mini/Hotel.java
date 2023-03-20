package com.mini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\inbas\\eclipse-workspace\\mini\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
		findElement.click();
		Thread.sleep(1000);

		WebElement findElement1 = driver.findElement(By.xpath("//input[@name='username']"));
		findElement1.sendKeys("hariinba");
		Thread.sleep(1000);
		
		WebElement findElement2 = driver.findElement(By.xpath("//input[@name='password']"));
		findElement2.sendKeys("Abcd@123");
		Thread.sleep(1000);

		WebElement findElement3 = driver.findElement(By.xpath("//input[@name='re_password']"));
		findElement3.sendKeys("Abcd@123");
		Thread.sleep(1000);
		
		WebElement findElement4 = driver.findElement(By.xpath("//input[@name='full_name']"));
		findElement4.sendKeys("kavish");
		Thread.sleep(1000);

		WebElement findElement5 = driver.findElement(By.xpath("//input[@name='email_add']"));
		findElement5.sendKeys("inbasakaran93@gmail.com");
		Thread.sleep(3000);

		WebElement findElement6 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		findElement6.click();
		Thread.sleep(1000);
		
		WebElement findElement7 = driver.findElement(By.xpath("//input[@name='Submit']"));
		findElement7.click();
		Thread.sleep(1000);
		
		WebElement findElement8 = driver.findElement(By.xpath("//a[text()='Go back to Login page']"));
		findElement8.click();
		Thread.sleep(1000);
		
		WebElement findElement9 = driver.findElement(By.xpath("//input[@name='username']"));
		findElement9.sendKeys("hariinba");
		Thread.sleep(1000);
		
		WebElement findElement10 = driver.findElement(By.xpath("//input[@name='password']"));
		findElement10.sendKeys("Abcd@123");
		Thread.sleep(1000);
		
		WebElement findElement11 = driver.findElement(By.xpath("//input[@name='login']"));
		findElement11.click();
		Thread.sleep(2000);
		
		WebElement findElement12 = driver.findElement(By.xpath("//select[@name='location']"));
		findElement12.sendKeys("London");
		
		WebElement findElement13 = driver.findElement(By.xpath("//select[@name='hotels']"));
		findElement13.sendKeys("Hotel Cornice");
		
		WebElement findElement14 = driver.findElement(By.xpath("//select[@name='room_type']"));
		findElement14.sendKeys("Standard");
		
		WebElement findElement15 = driver.findElement(By.xpath("//select[@name='room_nos']"));
		findElement15.sendKeys("3 - Three");

		WebElement findElement16 = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		findElement16.sendKeys("10/03/2023");

		WebElement findElement17 = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		findElement17.sendKeys("13/03/2023");

		WebElement findElement18 = driver.findElement(By.xpath("//input[@type='submit']"));
		findElement18.click();
		
		WebElement findElement19 = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		findElement19.click();
  
		WebElement findElement20 = driver.findElement(By.xpath("//input[@type='submit']"));
		findElement20.click();
		Thread.sleep(2000);
		
		driver.close();

		

		

		
		
		
	}

}
