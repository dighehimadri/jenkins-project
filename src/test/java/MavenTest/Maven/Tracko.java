package MavenTest.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Tracko {
  @Test
  public void f() {
  }
 
	  
  @BeforeTest
  public void beforeTest() throws InterruptedException 
  
	 {
	  System.setProperty("webdriver.Chrome.driver", "resource/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev.tracko.co.in/trackoweb/signup.html");
		driver.findElement(By.id("name")).sendKeys("himadri");
		driver.findElement(By.id("email")).sendKeys("himtech28@gmail.com");
		driver.findElement(By.id("mobile")).sendKeys("93279088118");
		driver.findElement(By.id("sub_btn_signup")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.id("otp")).sendKeys("123456");
		driver.findElement(By.id("sub_btn_verify")).click();
		driver.findElement(By.xpath("//button[@id='sub_btn'][@type='submit']")).click();
		driver.findElement(By.cssSelector("button[id='sub_btn'][type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys("testing12");
		driver.findElement(By.id("repassword")).sendKeys("testing12");
		driver.findElement(By.id("sub_btn_setpass")).click();
		
		
		     
		

  }

  @AfterTest
  public void afterTest() 
  {
  }

}
