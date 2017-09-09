package MavenTest.Maven;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Practice {

	public static void main(String[] args)throws InterruptedException {
		
			System.setProperty("webdriver.IE.driver", "resource/IEDriverServer.exe");
			InternetExplorerDriver driver = new InternetExplorerDriver();
			driver.get("https://dev.tracko.co.in/trackoweb/signup.html");
			Thread.sleep(5000);
			driver.findElementByCssSelector("name").sendKeys("himadri");
			driver.findElementByCssSelector("email").sendKeys("aswasv5@gmail.com");
			
System.out.println("himadri");
 	}

}
