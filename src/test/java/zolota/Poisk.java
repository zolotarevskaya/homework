package zolota;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import ru.stqa.selenium.factory.WebDriverFactory;


public class Poisk extends  TestBase {
	
	@Test 
	public void MovieFound() throws InterruptedException {
		
		driver.get(baseUrl + "/php4dvd/");
		driver.findElement(By.xpath(".//*[@id='q']")).sendKeys("Титаник");
		Thread.sleep(200);
		driver.findElement(By.xpath(".//*[@id='q']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		if (this.isElementPresent(driver, By.xpath(".//*[@id='results']")) == true) {
			
			if (this.isElementPresent(driver, By.xpath(".//*[@id='movie_25']")) == true) {
			System.out.println("Moviefound");
			
			}	
			
		} else {
			
			System.out.println("false");
			
		}
		Thread.sleep(5000);
		
	}
	
	@Test
	public void MovieNotFound() throws InterruptedException {
		
		driver.get(baseUrl + "/php4dvd/");
		driver.findElement(By.xpath(".//*[@id='q']")).clear();
		driver.findElement(By.xpath(".//*[@id='q']")).sendKeys("asd");
		driver.findElement(By.xpath(".//*[@id='q']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		if(driver.getPageSource().contains("No movies where found.")) {
			 System.out.println("MovieNotFound:done");
			 }
			 else {
				 System.out.println("MovieNotFound:fail");
			 }
	
		Thread.sleep(5000);
		
		
	}
	
	
	public boolean isElementPresent(WebDriver driver, By locator) {
		
		  return driver.findElements(locator).size() == 1;
		  
	}
	
	
	
}
