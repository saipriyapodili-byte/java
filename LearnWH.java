package week4.day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWH {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("(http://leaftaps.com/opentaps/control/login)");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String parentwindow=driver.getWindowHandle();
		System.out.println()
		
		
		
		
				
		
		
		

	}

}
