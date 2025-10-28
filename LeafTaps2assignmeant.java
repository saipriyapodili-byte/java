package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LeafTaps2assignmeant{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		
		ChromeDriver driver=new ChromeDriver();
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
	        // click on Account
	        driver.findElement(By.linkText("Accounts")).click();
	        //click on create Acoount
	        driver.findElement(By.linkText("Create Account")).click();
	        
	        //enter Account name
	        driver.findElement(By.id("accountName")).sendKeys("saipriya");
	        //enter Description
	        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	        

            // 1️⃣ Select "ComputerSoftware" as Industry
            WebElement industryDropdown = driver.findElement(By.name("industryEnumId"));
            Select industry = new Select(industryDropdown);
            industry.selectByVisibleText("ComputerSoftware");

            // 2️⃣ Select "S-Corporation" as Ownership
            WebElement ownershipDropdown = driver.findElement(By.name("ownershipEnumId"));
            Select ownership = new Select(ownershipDropdown);
            ownership.selectByVisibleText("S-Corporation");

            // 3️⃣ Select "Employee" as Source
            WebElement sourceDropdown = driver.findElement(By.id("dataSourceId"));
            Select source = new Select(sourceDropdown);
            source.selectByValue("LEAD_EMPLOYEE");

            // 4️⃣ Select "eCommerce Site Internal Campaign" as Marketing Campaign
            WebElement marketingDropdown = driver.findElement(By.id("marketingCampaignId"));
            Select marketing = new Select(marketingDropdown);
            marketing.selectByIndex(6); // use correct index from dropdown order

            // 5️⃣ Select "Texas" as State/Province
            WebElement stateDropdown = driver.findElement(By.id("generalStateProvinceGeoId"));
            Select state = new Select(stateDropdown);
            state.selectByValue("TX");
            //click the create account button
            driver.findElement(By.linkText("Create Account")).click();
            //// 1️⃣3️⃣ Click the "Create Account" button
            driver.findElement(By.className("smallSubmit")).click();

            // 1️⃣4️⃣ Print the account name from the resulting page
            WebElement accountNameElement = driver.findElement(By.id("accountName"));
            String createdAccountName = accountNameElement.getText();
            System.out.println("✅ Account created successfully: " + createdAccountName);

        
            // 1️⃣5️⃣ Close the browser
            try { Thread.sleep(2000); } catch (InterruptedException e) {}
            driver.quit();
        }
    

	        
	        

	}


