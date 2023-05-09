import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seliprog {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\JavaLearning\\trainingworkspace\\SeliniumProject\\geckodriver-v0.32.0-win64\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com");
	 Thread.sleep(5000);
	driver.findElement(By.xpath("a[href='practice-project']")).click();

	}
}
