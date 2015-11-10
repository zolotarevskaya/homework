package zolota;

import org.testng.annotations.*;
import org.openqa.selenium.*;




public class Delete extends TestBase {
	
	  private boolean acceptNextAlert = false;
	
	@Test
	public void DeleteMovie() throws InterruptedException {
		driver.get(baseUrl + "/php4dvd/");
		driver.findElement(By.xpath(".//*[@id='movie_23']/div[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//*[@id='content']/section/nav/ul/li[5]/div/div/a")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	
	

}
