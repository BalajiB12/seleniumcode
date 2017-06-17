package a;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome 
{
public static void main(String args[])throws WebDriverException
{
	System.setProperty("webdriver.chrome.driver","C:/Users/Dell/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("http://www.google.com");
	d.close();

	
}
}
