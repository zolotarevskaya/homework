package zolota;

import org.testng.annotations.*;
import org.openqa.selenium.*;




public class Delete extends TestBase {
	
	
	@Test
	public void DeleteMovie() throws InterruptedException {
		driver.get(baseUrl + "/php4dvd/");
		driver.findElement(By.xpath(".//*[@id='movie_13']/div[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//*[@id='content']/section/nav/ul/li[5]/div/div/a")).click();
		 if(driver.findElement(By.xpath(".//*[@id='content']/section/nav/ul/li[5]/div/div/a")) != null) {
			 System.out.println("CreateMovie:fail");
			 }
			 else {
				 System.out.println("CreateMovie:done");
			 } 
			
	}
	
	
	

}
