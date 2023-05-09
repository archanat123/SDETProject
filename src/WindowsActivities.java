import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsActivities {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\JavaLearning\\trainingworkspace\\SeliniumProject\\geckodriver-v0.32.0-win64\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://rahulshettyacademy.com/");
		driver.navigate().back();
		//driver.navigate().forward();
		
		// TODO Auto-generated method stub

	}

}
