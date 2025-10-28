package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafTaps2 {

	public static void main(String[] args) {
		
		ChromeOptions Options=new ChromeOptions();
		 Options.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(Options);
		
		
		        // Load the URL
		        driver.get("http://leaftaps.com/opentaps/");
		        
		        // Maximize the browser window
		        driver.manage().window().maximize();
		        
		        // Enter username
		        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		        
		        // Enter password
		        driver.findElement(By.id("password")).sendKeys("crmsfa");
		        
		        // Click on Login button
		        driver.findElement(By.className("decorativeSubmit")).click();
		        
		        // Click on CRM/SFA link
		        driver.findElement(By.linkText("CRM/SFA")).click();
		        
		        // Click on Accounts tab
		        driver.findElement(By.linkText("Accounts")).click();
		        
		        // Click on Create Account
		        driver.findElement(By.linkText("Create Account")).click();
		        
		        // Enter Account Name
		        driver.findElement(By.id("accountName")).sendKeys("BhaaCraft_Account");
		        
		        // Enter Description
		        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		        
		        // Enter Number Of Employees
		        driver.findElement(By.id("numberEmployees")).sendKeys("25");
		        
		        // Enter Site Name
		        driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		        
		        // Click on Create Account button
		        driver.findElement(By.className("smallSubmit")).click();
		        
		        System.out.println("✅ Account created successfully: ");
		        
		        driver.quit();
		        
		        
		    }
		}

		
		
		
		
		
		
		
		
  



