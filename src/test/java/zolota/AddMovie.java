package zolota;

import org.testng.annotations.*;
import org.openqa.selenium.*;


public class AddMovie extends TestBase {
	
	
	@Test
	public void CreateMovie() throws InterruptedException {
		
		 driver.findElement(By.xpath(".//*[@id='content']/section/nav/ul/li[1]/div/div/a")).click();
		 driver.findElement(By.name("name")).sendKeys("Тестовый Фильм"); //TITLE
		 driver.findElement(By.name("aka")).sendKeys("тест");  //also as
		 driver.findElement(By.name("year")).sendKeys("2015"); //YEAR
		 driver.findElement(By.name("duration")).sendKeys("60"); //duration
		 driver.findElement(By.name("rating")).sendKeys("9"); //rating
		 driver.findElement(By.name("trailer")).sendKeys("https://youtu.be/4Hau3QZh7FY"); //trailer
		 driver.findElement(By.name("notes")).sendKeys("test notes");
		 driver.findElement(By.name("taglines")).sendKeys("taglines");
		 driver.findElement(By.name("plotoutline")).sendKeys("plotoutline");
		 driver.findElement(By.name("plots")).sendKeys("plots"); 
		 driver.findElement(By.name("languages")).sendKeys("languages");
		 driver.findElement(By.name("subtitles")).sendKeys("subtitles");
		 driver.findElement(By.name("audio")).sendKeys("audio");
		 driver.findElement(By.name("video")).sendKeys("video");
		 driver.findElement(By.name("country")).sendKeys("country");
		 driver.findElement(By.name("genres")).sendKeys("genres");
		 driver.findElement(By.name("director")).sendKeys("director");
		 driver.findElement(By.name("writer")).sendKeys("writer");
		 driver.findElement(By.name("producer")).sendKeys("producer");
		 driver.findElement(By.name("music")).sendKeys("music");
		 driver.findElement(By.name("cast")).sendKeys("cast");
		 driver.findElement(By.name("submit")).click();
		 Thread.sleep(2000);
		 if(driver.getPageSource().contains("Тестовый Фильм")) {
			 System.out.println("CreateMovie:done");
			 }
			 else {
				 System.out.println("CreateMovie:fail");
			 }
		 
	}
	
	@Test
	public void CreateMovieFail() throws InterruptedException {
		 driver.get(baseUrl + "/php4dvd/");
		 driver.findElement(By.xpath(".//*[@id='content']/section/nav/ul/li[1]/div/div/a")).click();
		 driver.findElement(By.name("name")).sendKeys("Тестовый Фильм"); //TITLE
		 driver.findElement(By.name("aka")).sendKeys("тест");  //also as
		// driver.findElement(By.name("year")).sendKeys("2015"); //YEAR
		 driver.findElement(By.name("duration")).sendKeys("60"); //duration
		 driver.findElement(By.name("rating")).sendKeys("9"); //rating
		 driver.findElement(By.name("trailer")).sendKeys("https://youtu.be/4Hau3QZh7FY"); //trailer
		 driver.findElement(By.name("notes")).sendKeys("test notes");
		 driver.findElement(By.name("taglines")).sendKeys("taglines");
		 driver.findElement(By.name("plotoutline")).sendKeys("plotoutline");
		 driver.findElement(By.name("plots")).sendKeys("plots"); 
		 driver.findElement(By.name("languages")).sendKeys("languages");
		 driver.findElement(By.name("subtitles")).sendKeys("subtitles");
		 driver.findElement(By.name("audio")).sendKeys("audio");
		 driver.findElement(By.name("video")).sendKeys("video");
		 driver.findElement(By.name("country")).sendKeys("country");
		 driver.findElement(By.name("genres")).sendKeys("genres");
		 driver.findElement(By.name("director")).sendKeys("director");
		 driver.findElement(By.name("writer")).sendKeys("writer");
		 driver.findElement(By.name("producer")).sendKeys("producer");
		 driver.findElement(By.name("music")).sendKeys("music");
		 driver.findElement(By.name("cast")).sendKeys("cast");
		 driver.findElement(By.name("submit")).click();
		 Thread.sleep(2000);
		 if(driver.findElement(By.name("submit")) != null) {
			 System.out.println("CreateMovieFail:done");
			 }
			 else {
				 System.out.println("CreateMovieFail:fail");
			 }
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
