package testAnt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Guru99AntClass {

	@Test
	public  void  Guru99AntTestNGMethod(){
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\9\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://guru99.com");
		List<WebElement> listAllCourseLinks = driver.findElements(By.xpath("//div[@class='canvas-middle']//a"));
		for (WebElement webElement : listAllCourseLinks) {
			System.out.println(webElement.getAttribute("href"));
		}
	}
}

