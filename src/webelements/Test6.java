package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele = driver.findElement(By.id("username"));
		Point loc = ele.getLocation();
		System.out.println("The x coordinates "+loc.getX());
		System.out.println("The y coordinates "+loc.getY());
		driver.close();

	}

}
