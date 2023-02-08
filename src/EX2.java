import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class SE {

	@Test
	void TC1001wwNPRU()  {
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.findElement(By.id("vfb-5")).sendKeys(" Surapong");
		driver.findElement(By.id("vfb-7")).sendKeys(" Keaynin");
		
//		WebElement radio1 = driver.findElement(By.id("vfb-31-1"));
//		 radio1.click();
		
		driver.findElement(By.id("vfb-13-address")).sendKeys("Suphanburi");
		driver.findElement(By.id("vfb-13-address-2")).sendKeys("-");
		driver.findElement(By.id("vfb-13-city")).sendKeys("-");
		driver.findElement(By.id("vfb-13-state")).sendKeys("-");
		driver.findElement(By.id("vfb-13-zip")).sendKeys("Suphanburi");
//		Select option1 = new Select (driver.findElement (By.id("select2-vfb-13-country-results")));
//		option1.selectByVisibleText("select2-vfb-13-country-result-ajzg-Thailand");
		driver.findElement(By.id("vfb-14")).sendKeys("644259036@webmail.npru.ac.th");
//		driver.findElement(By.id("vfb-18")).click();
		driver.findElement(By.id("vfb-18")).sendKeys("08/02/2023");
		//?-?//
		driver.findElement(By.id("vfb-19")).sendKeys("0923687180");
		driver.findElement(By.id("vfb-20-0")).click();
		driver.findElement(By.id("vfb-20-1")).click();
		driver.findElement(By.id("vfb-20-2")).click();
		driver.findElement(By.id("vfb-20-3")).click();
		driver.findElement(By.id("vfb-20-4")).click();
		driver.findElement(By.id("vfb-20-5")).click();
		
		driver.findElement(By.id("vfb-23")).sendKeys("T-T");
		driver.findElement(By.id("vfb-3")).sendKeys("99");
		driver.findElement(By.id("vfb-4")).click();
//		String result = driver.findElement(By.id("comment")).getText();
//		assertEquals("T-T", result);

		
		//        driver.close();
	}
	
}
