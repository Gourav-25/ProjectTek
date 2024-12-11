package browser;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.amazon.in");	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	Long windowht=(Long) js.executeScript("return window.innerHeight;");
	System.out.println(windowht);
	Long docHeight=(Long) js.executeScript("return document.body.scrollHeight;");
    System.out.println(docHeight);
	}
}
