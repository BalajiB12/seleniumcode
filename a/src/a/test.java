package a;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","D:/eclipse-jee-luna-R-win32/eclipse/a/geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("http://google.com");
		d.findElement(By.id("lst-ib")).sendKeys("balaji");
		d.findElement(By.id("lst-ib")).click();
		Thread.sleep(3000);
		List<WebElement>ls=d.findElements(By.className("sbsb_b"));
			ls.get(0).click();
		}
	}


