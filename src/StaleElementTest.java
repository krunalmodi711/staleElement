import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class StaleElementTest {
	
	
	@Test
	public void checkStaleElementTest(){
		
		System.setProperty("webdriver.gecko.driver","G:\\Neon\\gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/krunal/Desktop/Selenium%20webpages/HTMLTag.html");
		
		WebElement element = driver.findElement(By.id("txtUserName"));
		element.sendKeys("krunal");
		System.out.println("value entered");
		driver.navigate().refresh();
		System.out.println("page refreshed");
		WebElement obelement = driver.findElement(By.id("txtUserName"));
		obelement.clear();
		System.out.println("value cleared");
		
	}

}
